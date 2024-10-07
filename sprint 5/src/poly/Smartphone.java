package poly;

import java.util.Scanner;

// допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone {

    public Smartphone(String number) {
        super(number);
    }

    // объявите метод sendEmail()
    public final void sendEmail(String messageText, String email) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    public final void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
    }
}





