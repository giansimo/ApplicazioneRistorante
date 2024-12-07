//Classe che contiene le istanze delle portate del menù
public class Menu {

    private Portata[] portate;
    private int numberOfPortate;

    public Menu(int capacità) {
        this.portate = new Portata[capacità];
    }

    //Da eliminare
    private Antipasti[] antipastiMenu = new Antipasti[10];
    private int numberOfAntipasti;

    //Da eliminare
    private Bevande[] bevandeMenu = new Bevande[10];
    private int numberOfBevande;

    //Funzione che aggiunge portate all'array delle portate
    public void addPortata(Portata portata){
        if(numberOfPortate < 50){
            portate[numberOfPortate] = portata;
            numberOfPortate++;
        }else{
            System.out.println("Errore: numero massimo di portate raggiunto!");
        }
    }

    //Da eliminare
    public void addAntipasti(Antipasti antipasti) {
        if (numberOfAntipasti < 10) {
            antipastiMenu[numberOfAntipasti] = antipasti;
            numberOfAntipasti++;
        } else {
            System.out.println("Errore: numero massimo di antipasti raggiunto!");

        }
    }
  
    //Da eliminare
    public void addBevande(Bevande bevanda) {
        if (numberOfBevande < 10) {
            bevandeMenu[numberOfBevande] = bevanda;
            numberOfBevande++;
        } else {
            System.out.println("Errore: numero massimo di bevande raggiunto!");

        }
    }

    @Override
    public String toString() {

        if (numberOfPortate == 0) {
            return "Il menù è vuoto";
        }

        StringBuilder antipastiMenu = new StringBuilder("\n")
                .append(TipologiaPortata.ANTIPASTI.getTipologia().toUpperCase())
                .append(" -----\n\n");

        StringBuilder primiMenu = new StringBuilder("\n")
                .append(TipologiaPortata.PRIMI.getTipologia().toUpperCase())
                .append(" -----\n\n");

        StringBuilder secondiMenu = new StringBuilder("\n")
                .append(TipologiaPortata.SECONDI.getTipologia().toUpperCase())
                .append(" -----\n\n");

        StringBuilder dessertMenu = new StringBuilder("\n")
                .append(TipologiaPortata.DESSERT.getTipologia().toUpperCase())
                .append(" -----\n\n");

        StringBuilder bevandeMenu = new StringBuilder("\n")
                .append(TipologiaPortata.BEVANDE.getTipologia().toUpperCase())
                .append(" -----\n\n");

        for (int i = 0; i < numberOfPortate; i++) {
            switch (portate[i].getTipologiaPortata()) {
                case ANTIPASTI -> antipastiMenu.append(portate[i]).append("\n\n-------------\n\n");
                case PRIMI -> primiMenu.append(portate[i]).append("\n\n-------------\n\n");
                case SECONDI -> secondiMenu.append(portate[i]).append("\n\n-------------\n\n");
                case DESSERT -> dessertMenu.append(portate[i]).append("\n\n-------------\n\n");
                case BEVANDE -> bevandeMenu.append(portate[i]).append("\n\n-------------\n\n");
            }
        }

        StringBuilder menu = new StringBuilder("\n-------------- MENÙ --------------\n\n")
                .append(antipastiMenu)
                .append(primiMenu)
                .append(secondiMenu)
                .append(dessertMenu)
                .append(bevandeMenu);

        return menu.toString();
    }
}
