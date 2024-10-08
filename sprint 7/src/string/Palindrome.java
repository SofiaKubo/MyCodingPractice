package string;

public class Palindrome {
    public boolean isPalindromeWord(String str) {
        StringBuilder builder = new StringBuilder(str.toLowerCase());
        int index = 0;

        while (index != -1) {
            index = builder.indexOf(" ", index);
            if (index != -1) {
                builder.deleteCharAt(index);
            }
        }
        StringBuilder reversed = new StringBuilder(builder);
        reversed.reverse();
        return builder.toString().equals(reversed.toString());
    }
}


class Test {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindromeWord("Молебен о коне белом"));
        System.out.println(palindrome.isPalindromeWord("А роза упала на лапу Азора"));
        System.out.println(palindrome.isPalindromeWord("Он едет на черном мотоцикле, а не том"));
        /*System.out.println(palindrome.isPalindromeWord("казак"));
        System.out.println(palindrome.isPalindromeWord(""));
        System.out.println(palindrome.isPalindromeWord("автозак"));*/
    }
}