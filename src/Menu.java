import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
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

    //Funzione che salva il menù su un file JSON (sovrascrivendone il contenuto)
    public void saveOnFile(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        objectMapper.writerFor(new TypeReference<List<Portata>>() {}).writeValue(new File(path), portate);
    }

    //Da fare (vedi Trello)
    public void deletePortata(String name) throws IllegalArgumentException {
        boolean found = portate.removeIf(portata -> portata.getNome().equalsIgnoreCase(name));
        if (!found) {
            throw new IllegalArgumentException("Nessuna portata trovata con il nome \"" + name + "\".");
        }
    }

    //Da fare (vedi Trello)
    public void downloadFromFile(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File(path);
        addAllPortate(objectMapper.readValue(jsonFile, new TypeReference<>() {}));
    }

    //Da fare (vedi Trello)
    public void print() {
        System.out.println(this);
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
