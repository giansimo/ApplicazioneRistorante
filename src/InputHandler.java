import java.util.Collection;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;
    private static InputHandler instance;

    private InputHandler() {
        scanner = new Scanner(System.in);
    }

    public static InputHandler getInstance() {
        if (instance == null) {
            instance = new InputHandler();
        }

        return instance;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void closeScanner() {
        scanner.close();
    }

    public int scanInt() {
        while (true) {
            try {
                int n = scanner.nextInt();
                scanner.nextLine();
                return n;
            } catch (NoSuchElementException e) {
                System.out.println("\u001B[31mInput non valido\u001B[0m");
                System.out.print("Inserisci un numero intero: ");
                scanner.nextLine();
            } catch (IllegalStateException e) {
                System.out.println("\u001B[31mScanner chiuso\u001B[0m");
                return 0;
            }
        }
    }

    public double scanDouble() {
        while (true) {
            try {
                double d = scanner.nextDouble();
                scanner.nextLine();
                return d;
            } catch (NoSuchElementException e) {
                System.out.println("\u001B[31mInput non valido\u001B[0m");
                System.out.print("Inserisci un numero (es. \"3,25\"): ");
                scanner.nextLine();
            } catch (IllegalStateException e) {
                System.out.println("\u001B[31mScanner chiuso\u001B[0m");
                return 0;
            }
        }
    }

    public String scanString() {
        try {
            return scanner.nextLine();
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("\u001B" + e.getMessage() + "\u001B[0m");
            return "";
        }
    }

    public int scanIntIfInRange(int min, int max) {
        int n;
        while (true) {
            n = scanInt();
            if (DataValidator.numberIsInRange(n, min, max)) {
                break;
            }
            System.out.print("Inserisci un numero compreso tra " + min + " e " + max + ": ");
        }
        return n;
    }

    public double scanDoubleIfInRange(double min, double max) {
        double d;
        while (true) {
            d = scanDouble();
            if (DataValidator.numberIsInRange(d, min, max)) {
                break;
            }
            System.out.print("Inserisci un numero compreso tra " + min + " e " + max + ": ");
        }
        return d;
    }

    public String scanStringIfInCollection(Collection<String> collection) {
        String string;
        while (true) {
            string = scanString();
            if (DataValidator.stringIsInCollection(string, collection)) {
                break;
            }
            System.out.print("Inserisci un valore tra " + collection + ": ");
        }
        return string;
    }

    public String scanStringIfTipologia() {
        String string;
        while (true) {
            string = scanString();
            if (DataValidator.stringIsTipologia(string)) {
                break;
            }
            System.out.print("Inserisci un valore tra \"Antipasti\", \"Primi\", \"Secondi\", \"Dessert\", \"Bevande\": ");
        }
        return string;
    }

    public String scanStringIfBoolean() {
        String string;
        while (true) {
            string = scanString();
            if (DataValidator.stringIsBoolean(string)) {
                break;
            }
            System.out.print("Inserisci un valore tra \"sì\" e \"no\": ");
        }
        return string;
    }


}
