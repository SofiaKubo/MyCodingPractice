package poly;

public class MobilePhone extends Phone {

    public MobilePhone(String number) {
        super(number);
    }

    //объявите метод sendSms()
    public final void sendSms(String messageText, String targetNumber) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}
