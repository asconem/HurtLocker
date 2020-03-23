import java.util.regex.Pattern;

public class ItemParser {

    public static Item parseItem(String line) throws IllegalArgumentException {
        String name = null;
        String price = null;
        String type = null;
        String expiration = null;

        return new Item(name, price, type, expiration);
    }

    public static String[] separateByWord(String line) {
        return line.split("[^a-zA-Z0-9/.]");
    }

    public static String matchName(String name) {
        Pattern apples = Pattern.compile("[aA][pP][pP][lL][eE][sS]");
        Pattern bread = Pattern.compile("[bB][rR][eE][aA][dD]");
        Pattern cookies = Pattern.compile("[cC][oO0][oO0][kK][iI][eE][sS]");
        Pattern milk = Pattern.compile("[mM][iI][lL][kK]");

        if(apples.matcher(name).matches()) {
            name = "Apples";
        }
        else if(bread.matcher(name).matches()) {
            name = "Bread";
        }
        else if(cookies.matcher(name).matches()) {
            name = "Cookies";
        }
        else if(milk.matcher(name).matches()) {
            name = "Milk";
        }
        else {
            throw new IllegalArgumentException();
        }
        return name;
    }
}
