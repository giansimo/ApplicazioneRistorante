import java.util.Arrays;
import java.util.Collection;

public class DataValidator {

    public static boolean numberIsInRange(double number, double min, double max) {
        return number <= max && number >= min;
    }

    public static boolean stringIsInCollection(String string, Collection<String> collection) {
        return collection.contains(string.toLowerCase());
    }

    public static boolean stringIsBoolean(String string) {
        return stringIsInCollection(string.toLowerCase(), Arrays.asList("si", "sì", "no"));
    }

    public static boolean stringIsTipologia(String string) {
        return stringIsInCollection(string.toLowerCase(), Arrays.asList("antipasti", "primi", "secondi", "dessert", "bevande"));
    }

}
