import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

//Classe che contiene le istanze delle portate del menù
public class Menu {

    private final ArrayList<Portata> portate = new ArrayList<>();

    public Menu() {}

    //Funzione che aggiunge una portata all'array delle portate
    public void addPortata(Portata portata){
        portate.add(portata);
        portate.sort(Comparator.comparing(Portata::getTipologiaPortata));
    }

    //Funzione che aggiunge una collezione di portate all'array delle portate
    public void addAllPortate(Collection<Portata> portate){
        this.portate.addAll(portate);
        this.portate.sort(Comparator.comparing(Portata::getTipologiaPortata));
    }


    @Override
    public String toString() {

        if (portate.isEmpty()) {
            return "Il menù è vuoto";
        }

        StringBuilder menu = new StringBuilder("\n-------------- MENÙ --------------\n\n\n")
                .append(portate.get(0).getTipologiaPortata())
                .append(" -----\n\n")
                .append(portate.get(0))
                .append("\n\n-------------\n\n");

        for (int i = 1; i < portate.size(); i++) {

            menu
                    .append(portate.get(i).getTitleIfNewSection(portate.get(i - 1)))
                    .append(portate.get(i))
                    .append("\n\n-------------\n\n");

        }

        return menu.toString();
    }
}
