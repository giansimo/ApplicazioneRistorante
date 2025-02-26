import java.util.*;

//Rimuovere scanner, da inserire in una classe a parte
public class PortataFactory {
    public static Portata getPortata(Map<String, String> map) {

        String nome = map.get("nome");
        String descrizione = map.get("descrizione");
        double prezzo = Double.parseDouble(map.get("prezzo"));
        String[] ingredienti = map.get("ingredienti").replaceAll(" ", "").split(",");

        switch (TipologiaPortata.valueOf(map.get("tipo"))) {
            case BEVANDE -> {
                Temperatura temperatura = Temperatura.valueOf(map.get("temperatura"));
                boolean alcolico = !map.get("alcolico").equalsIgnoreCase("no");
                return new Bevande(nome, descrizione, prezzo, ingredienti, temperatura, alcolico);
            }

            case ANTIPASTI -> {
                boolean isVegano = !map.get("isVegano").equalsIgnoreCase("no");
                return new Antipasti(nome, descrizione, prezzo, ingredienti, isVegano);
            }

            case PRIMI -> {
                String tipoDiCottura = map.get("tipoDiCottura");
                return new Primi(nome, descrizione, prezzo, ingredienti, tipoDiCottura);
            }

            case SECONDI -> {
                String cottura = map.get("cottura");
                String categoriaAlimentazione = map.get("categoriaAlimentazione");
                return new Secondi(nome, descrizione, prezzo, ingredienti, cottura, categoriaAlimentazione);
            }

            case DESSERT -> {
                Temperatura temperatura = Temperatura.valueOf(map.get("temperatura"));
                return new Dessert(nome, descrizione, prezzo, ingredienti, temperatura);
            }

            default -> {
                return null;
            }
        }
    }
}
