package string;

public class OnlySubstring {
    public boolean onlySingleSubstring(String initialString, String substring) {
        System.out.println(initialString.indexOf(substring));
        initialString.lastIndexOf(substring);
        return initialString.indexOf(substring) == initialString.lastIndexOf(substring);
    }

    public static void main(String[] args) {
        var os = new OnlySubstring();
        System.out.println(os.onlySingleSubstring("раз два, раз два", "раз"));
        System.out.println(os.onlySingleSubstring("раз два", "раз"));
    }
}
