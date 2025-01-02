import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            File jsonFile = new File("menu.json");
            menu.addAllPortate(objectMapper.readValue(jsonFile, new TypeReference<>() {}));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(menu);

    }
}