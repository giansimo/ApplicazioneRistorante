import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        String filePath = "menu.json";
        MenuConsoleHandler menuConsoleHandler = new MenuConsoleHandler();
        menuConsoleHandler.handleMenu(menu, filePath);

    }
}