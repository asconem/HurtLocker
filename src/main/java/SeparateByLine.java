public class SeparateByLine {

    public static String[] separate(String text) {
        String[] lines = text.split("##");
        return lines;
    }
}
