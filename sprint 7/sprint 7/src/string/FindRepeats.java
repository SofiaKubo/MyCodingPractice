package string;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        StringBuilder sb = new StringBuilder(text);
        int counter = 0;
        int index = sb.indexOf(substring);
        while (index != -1) {
            counter++;
            int cuttingIndex = index + substring.length();
            sb.delete(0, cuttingIndex);
            index = sb.indexOf(substring);
        }
        return counter;
    }
}


class FindRepeatsNew {
    int numberOfRepeats(String text, String substring) {
        if (substring.isEmpty()) {
            return 0;
        }
        int counter = 0;
        int index = text.indexOf(substring);

        while (index != -1) {
            counter++;
            index = text.indexOf(substring) + substring.length();
        }
        return counter;
    }
}