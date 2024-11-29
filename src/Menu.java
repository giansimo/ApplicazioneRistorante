//Classe che contiene le istanze delle portate del menù
public class Menu {



    private Dessert[] dessertMenu = new Dessert[10];
    private int numberOfDessert;


    private Antipasti[] antipastiMenu = new Antipasti[10];
    private int numberOfAntipasti;

    private Bevande[] bevandeMenu = new Bevande[10];
    private int numberOfBevande;


    //Funzione che aggiunge portate al menù dei dessert
    public void addDessert(Dessert dessert) {
        if (numberOfDessert < 10) {
            dessertMenu[numberOfDessert] = dessert;
            numberOfDessert++;
        } else {
            System.out.println("Errore: numero massimo di dessert raggiunto!");
        }
    }


    public void addAntipasti(Antipasti antipasti) {
        if (numberOfAntipasti < 10) {
            antipastiMenu[numberOfAntipasti] = antipasti;
            numberOfAntipasti++;
        } else {
            System.out.println("Errore: numero massimo di antipasti raggiunto!");

        }
    }
    //Funzione che aggiunge portate al menù delle bevande
    public void addBevande(Bevande bevanda) {
        if (numberOfBevande < 10) {
            bevandeMenu[numberOfBevande] = bevanda;
            numberOfBevande++;
        } else {
            System.out.println("Errore: numero massimo di bevande raggiunto!");

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



    private String getAntipastiMenu() {

        if (numberOfAntipasti == 0) {
            return "";
        }

        String antipasti = "\nAntipasti -----\n\n";
        for (int i = 0; i < numberOfAntipasti; i++) {
            antipasti += this.antipastiMenu[i] + "\n\n-------------\n\n";
        }
        return antipasti;
    }
  
  
    private String getBevandeMenu() {

        if (numberOfBevande == 0) {
            return "";
        }
      
      

        String bevandeMenu = "\nBEVANDE -----\n\n";
        for (int i = 0; i < numberOfBevande; i++) {
            bevandeMenu += this.bevandeMenu[i] + "\n\n-------------\n\n";

        }
        return bevandeMenu;
    }
  

    @Override
    public String toString() {
        return "\n-------------- MENÙ --------------\n\n" +
                getDessertMenu() +
                getAntipastiMenu() +
                getBevandeMenu();

        //Aggiungere nel return le stringhe con i menù delle altre portate
        //(ad esempio getAntipastiMenu())

    }
}
