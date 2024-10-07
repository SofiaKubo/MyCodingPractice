package string;

public class PoemFixer {
    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        StringBuilder sb = new StringBuilder(); // допишите код
        for (String line: poem) {
            if (!line.isEmpty() && !line.isBlank()) {
                sb.append(line.trim());
                sb.append("\n");
            }
        }
        String asString = sb.toString();
        return asString;
    }

    public static void main(String[] args) {
        PoemFixer poemFixer = new PoemFixer();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}

class Practic {
    public static void main(String[] args) {
        String[] rainbow = new String[]{
                "Красный",
                "Оранжевый",
                "Жёлтый",
                "Зелёный",
                "Голубой",
                "Синий",
                "Фиолетовый"
        };

        StringBuilder sbRainbow = new StringBuilder();
        for (int i = 0; i < rainbow.length; i++) {
            sbRainbow.append(rainbow[i]);
            if (i != rainbow.length - 1) {
                sbRainbow.append(", ");
            }
        }

        System.out.println(sbRainbow.toString());
    }
}