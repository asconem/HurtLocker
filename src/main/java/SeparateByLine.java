public class SeparateByLine {

    public static String[] separateByLine(String text) {
        String[] lines = text.split("##");
        return lines;
    }
}
