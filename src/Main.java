import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creare funzione downloadFromFile(String path) in Menu per aggiungere portate da file al menu
        /*
        Menu menu = new Menu();
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            File jsonFile = new File("menu.json");
            menu.addAllPortate(objectMapper.readValue(jsonFile, new TypeReference<>() {}));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        */

        //Inizio programma
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nGESTIONE DEL MENU");

        Menu menu = new Menu();
        int opzione;

        while (true) {

            System.out.print("""
                
                Cosa vuoi fare?
                
                1. Scarica il menu
                2. Mostra il menu
                3. Aggiungi una portata
                4. Elimina una portata
                5. Salva il menu
                6. Termana il programma
                
                """);

            opzione = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opzione) {
                    case 1 -> {
                        menu.downloadFromFile("menu.json");
                        System.out.println("Download completato");
                    }
                    case 2 -> menu.print();
                    case 3 -> {
                        System.out.print("Quale tipologia di portata vuoi aggiungere? ");
                        TipologiaPortata tipo = TipologiaPortata.valueOf(scanner.nextLine().toUpperCase());
                        Portata portata = PortataFactory.getPortata(tipo, scanner);
                        menu.addPortata(portata);
                        System.out.println("Portata aggiunta al menù");
                    }
                    case 4 -> {
                        System.out.print("Quale portata vuoi eliminare? ");
                        String name = scanner.nextLine().trim();
                        menu.deletePortata(name);
                        System.out.println("Portata \"" + name + "\" eliminata");
                    }
                    case 5 -> {
                        menu.saveOnFile("menu.json");
                        System.out.println("Menù salvato");
                    }
                    case 6 -> {
                        scanner.close();
                        return;
                    }
                    default -> throw new IllegalArgumentException("Numero non valido");
                }
            } catch (IOException | IllegalArgumentException e) {
                System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
            }
        }
    }
}