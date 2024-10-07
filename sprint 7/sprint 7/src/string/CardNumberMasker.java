package string;

public class CardNumberMasker {
    public String maskCardNumber(String cardNumber) {
        return cardNumber.substring(0, 4)
                + "********"
                + cardNumber.substring(cardNumber.length() - 4); // реализуйте вашу версию метода здесь

    }

    public static void main(String[] args) {
        CardNumberMasker masker = new CardNumberMasker();
        System.out.println(masker.maskCardNumber("1111222233334444"));
        System.out.println(masker.maskCardNumber("1234567890123456"));
    }
}
