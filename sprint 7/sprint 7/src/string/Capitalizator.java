package string;

public class Capitalizator {
    public String capitalize(String str) {
        String firstLetter = str.substring(0, 1).toUpperCase();
        str = firstLetter + str.substring(1);
        return str;
    }
}
