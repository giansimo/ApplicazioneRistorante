//Classe che contiene le istanze delle portate del menù
public class Menu {

    //Aggiungere qui gli altri attributi di questa classe per ciascuna portata

    //Massimo 10 piatti per portata (Non conosciamo ancora gli array dinamici)

    private Dessert[] dessertMenu = new Dessert[10];
    private int numberOfDessert;

    //Funzione che aggiunge portate al menù dei dessert
    public void addDessert(Dessert dessert) {
        if (numberOfDessert < 10) {
            dessertMenu[numberOfDessert] = dessert;
            numberOfDessert++;
        } else {
            System.out.println("Errore: numero massimo di dessert raggiunto!");
        }
    }

    //Aggiungere qui le funzioni per le altre portate (opzionale)

    //Funzione ausiliaria che restituisce il menù dei dessert
    private String getDessertMenu() {

        if (numberOfDessert == 0) {
            return "";
        }

        String dessertMenu = "\nDESSERT -----\n\n";
        for (int i = 0; i < numberOfDessert; i++) {
            dessertMenu += this.dessertMenu[i] + "\n\n-------------\n\n";
        }
        return dessertMenu;
    }

    @Override
    public String toString() {
        return "\n-------------- MENÙ --------------\n\n" +
                getDessertMenu();

        //Aggiungere nel return le stringhe con i menù delle altre portate
        //(ad esempio getAntipastiMenu())

    }
}
