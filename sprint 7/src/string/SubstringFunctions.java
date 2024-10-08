package string;

public class SubstringFunctions {
    public boolean startsWith(String initial, String other) {
        return initial.indexOf(other)  == 0; // реализуйте метод
    }

    public boolean endsWith(String initial, String other) {
         int position = initial.lastIndexOf(other);
         return (initial.length() - position) == other.length();
    }

    public static void main(String[] args) {
        var os = new SubstringFunctions();
        System.out.println(os.endsWith("жираф", "раф"));
        System.out.println(os.endsWith("кошка", "каша"));
        System.out.println(os.endsWith("капот", "кап"));
    }
}
