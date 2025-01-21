import java.io.IOException;
import java.util.*;

public class MenuConsoleHandler {
    private InputHandler inputHandler;

    public MenuConsoleHandler() {
        inputHandler = InputHandler.getInstance();
    }

    public void handleMenu(Menu menu, String filePath) {

        System.out.println("\nGESTIONE DEL MENU");

        int opzione;

        while (true) {

            System.out.print("""
                
                Cosa vuoi fare?
                
                1. Carica il menu
                2. Mostra il menu
                3. Aggiungi una portata
                4. Elimina una portata
                5. Salva il menu
                6. Termana il programma
                
                """);

            opzione = inputHandler.scanIntIfInRange(1, 6);

            switch (opzione) {
                case 1 -> downloadMenuFromFile(menu, filePath);
                case 2 -> menu.print();
                case 3 -> addPortata(menu);
                case 4 -> deletePortata(menu);
                case 5 -> saveMenuOnFile(menu, filePath);
                case 6 -> {
                    inputHandler.closeScanner();
                    System.out.println("Programma terminato");
                    return;
                }
            }
        }
    }

    private void downloadMenuFromFile(Menu menu, String filePath) {
        try {
            menu.downloadFromFile(filePath);
            System.out.println("Download completato");
        } catch (IOException e) {
            System.out.println("\u001B[31mFile non trovato\u001B[0m");
        }
    }

    private void deletePortata(Menu menu) {
        try {
            System.out.print("Quale portata vuoi eliminare? ");
            String name = inputHandler.scanString().trim();
            menu.deletePortata(name);
            System.out.println("Portata \"" + name + "\" eliminata");
        } catch (IllegalArgumentException e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
        }
    }

    private void saveMenuOnFile(Menu menu, String filePath) {
        try {
            menu.saveOnFile(filePath);
            System.out.println("Menù salvato");
        } catch (IOException e) {
            System.out.println("\u001B[31mErrore durante il salvataggio\u001B[0m");
        }
    }

    private void addPortata(Menu menu) {

        Map<String, String> map = new HashMap<>();

        System.out.print("Quale tipologia di portata vuoi aggiungere (Antipasti, Primi, Secondi, Dessert, Bevande)? ");
        String tipologiaPortataString = inputHandler.scanStringIfTipologia().toUpperCase();
        map.put("tipo", tipologiaPortataString);

        System.out.print("Nome: ");
        String nome = inputHandler.scanString().trim();
        map.put("nome", nome);

        System.out.print("Descrizione: ");
        String descrizione = inputHandler.scanString().trim();
        map.put("descrizione", descrizione);

        System.out.print("Ingredienti (separati da una virgola, es. \"latte, farina, zucchero\"): ");
        String ingredienti = inputHandler.scanString().trim();
        map.put("ingredienti", ingredienti);

        System.out.print("Prezzo: ");
        double prezzo = inputHandler.scanDoubleIfInRange(0, 1000);
        map.put("prezzo", String.valueOf(prezzo));

        switch (TipologiaPortata.valueOf(tipologiaPortataString)) {

            case ANTIPASTI -> {
                System.out.print("Antipasto vegano (sì/no)? ");
                String isVeganoString = inputHandler.scanStringIfBoolean();
                map.put("isVegano", isVeganoString);
            }

            case PRIMI -> {
                System.out.print("Tipo di cottura: ");
                String tipoDiCottura = inputHandler.scanString().trim();
                map.put("tipoDiCottura", tipoDiCottura);
            }

            case SECONDI -> {
                System.out.print("Cottura: ");
                String cottura = inputHandler.scanString().trim();
                map.put("cottura", cottura);

                System.out.print("Categoria alimentazione: ");
                String categoriaAlimentazione = inputHandler.scanString().trim();
                map.put("categoriaAlimentazione", categoriaAlimentazione);
            }

            case DESSERT -> {
                System.out.print("Temperatura (\"caldo\", \"tiepido\", \"freddo\"): ");
                String temperaturaString = inputHandler.scanStringIfInCollection(Arrays.asList("caldo", "tiepido", "freddo")).toUpperCase();
                map.put("temperatura", temperaturaString);
            }

            case BEVANDE -> {
                System.out.print("Temperatura (\"caldo\", \"tiepido\", \"freddo\"): ");
                String temperaturaString = inputHandler.scanStringIfInCollection(Arrays.asList("caldo", "tiepido", "freddo")).toUpperCase();
                map.put("temperatura", temperaturaString);

                System.out.print("Bevanda alcolica (sì/no)? ");
                String isAlcolicaString = inputHandler.scanStringIfBoolean();
                map.put("alcolico", isAlcolicaString);
            }
        }

        Portata portata = PortataFactory.getPortata(map);
        menu.addPortata(portata);
        System.out.println("Portata aggiunta al menù");
    }

}
