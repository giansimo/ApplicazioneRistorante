import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PortataFactory {
    public static Portata getPortata(TipologiaPortata tipologiaPortata, Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine().trim();
        System.out.print("Descrizione: ");
        String descrizione = scanner.nextLine().trim();
        System.out.print("Ingredienti (separati da una virgola, es. \"latte, farina, zucchero\"): ");
        String[] ingredienti = scanner.nextLine().replaceAll(" ", "").split(",");
        System.out.print("Prezzo: ");
        double prezzo;
        while (true) {
            try {
                prezzo = scanner.nextDouble();
                break;
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
                System.out.print("Inserisci un prezzo valido: ");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        switch (tipologiaPortata) {

            case ANTIPASTI -> {
                System.out.print("Antipasto vegano (sì/no)? ");
                String veganoAnswer = scanner.nextLine().trim();
                while (!veganoAnswer.equalsIgnoreCase("sì") && !veganoAnswer.equalsIgnoreCase("si") && !veganoAnswer.equalsIgnoreCase("no")) {
                    System.out.println("\u001B[31m" + "Input non valido" + "\u001B[0m");
                    System.out.print("Inserisci \"sì\" o \"no\": ");
                    veganoAnswer = scanner.nextLine().trim();
                }
                boolean isVegano = !veganoAnswer.equalsIgnoreCase("no");
                return new Antipasti(nome, descrizione, prezzo, ingredienti, isVegano);
            }

            case PRIMI -> {
                System.out.print("Tipo di cottura: ");
                String tipoDiCottura = scanner.nextLine().trim();
                return new Primi(nome, descrizione, prezzo, ingredienti, tipoDiCottura);
            }

            case SECONDI -> {
                System.out.print("Cottura: ");
                String cottura = scanner.nextLine().trim();
                System.out.print("Categoria alimentazione: ");
                String categoriaAlimentazione = scanner.nextLine().trim();
                return new Secondi(nome, descrizione, prezzo, ingredienti, cottura, categoriaAlimentazione);
            }

            case DESSERT -> {
                System.out.print("Temperatura (\"caldo\", \"tiepido\", \"freddo\"): ");
                String temperaturaAnswer;
                while (true) {
                    try {
                        temperaturaAnswer = scanner.nextLine().trim().toUpperCase();
                        Temperatura temperatura = Temperatura.valueOf(temperaturaAnswer);
                        return new Dessert(nome, descrizione, prezzo, ingredienti, temperatura);
                    } catch (IllegalArgumentException e) {
                        System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
                        System.out.print("Inserisci una temperatura valida: ");
                    }
                }
            }

            case BEVANDE -> {
                System.out.print("Temperatura (\"caldo\", \"tiepido\", \"freddo\"): ");
                String temperaturaAnswer;
                Temperatura temperatura;
                while (true) {
                    try {
                        temperaturaAnswer = scanner.nextLine().trim().toUpperCase();
                        temperatura = Temperatura.valueOf(temperaturaAnswer);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
                        System.out.print("Inserisci una temperatura valida: ");
                    }
                }
                System.out.print("Bevanda alcolica (sì/no)? ");
                String alcolicoAnswer = scanner.nextLine().trim();
                while (!alcolicoAnswer.equalsIgnoreCase("sì") && !alcolicoAnswer.equalsIgnoreCase("si") && !alcolicoAnswer.equalsIgnoreCase("no")) {
                    System.out.println("\u001B[31m" + "Input non valido" + "\u001B[0m");
                    System.out.print("Inserisci \"sì\" o \"no\": ");
                    alcolicoAnswer = scanner.nextLine().trim();
                }
                boolean alcolico = !alcolicoAnswer.equalsIgnoreCase("no");
                return new Bevande(nome, descrizione, prezzo, ingredienti, temperatura, alcolico);
            }

            default -> {
                return null;
            }
        }
    }
}
