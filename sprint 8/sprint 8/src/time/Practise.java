package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Practise {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        DateTimeFormatter formatterO = DateTimeFormatter.ofPattern("День:d Месяц:MMMM Год:YYYY");
        String formattedTime = time.format(formatterO);
        System.out.println(formattedTime);

        LocalDateTime dateTime = LocalDateTime.parse("2021-12-21T21:21:21");
        System.out.println(dateTime);

        DateTimeFormatter oneFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH-mm");
        LocalDateTime oneDateTime = LocalDateTime.parse("22-02-2022, 22-22", oneFormatter);
        System.out.println(oneDateTime);

        DateTimeFormatter twoFormatter = DateTimeFormatter.ofPattern("dd*MM*yyyy, HH*mm");
        LocalDateTime twoDateTime = LocalDateTime.parse("22*02*2022, 22*22", twoFormatter);
        System.out.println(twoDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");

        LocalDateTime anotherDateTime = LocalDateTime.parse("22.02.2022, 22:22", formatter);
        System.out.println(anotherDateTime);

        System.out.println(dateTime.isAfter(anotherDateTime));


        class Practicum {
            public static void main(String[] args) {
                String input = "14 часов 09 минут. Месяц: 02, День: 14, Год: 1966.";

                printCorrectDateTime(input);
            }

            private static void printCorrectDateTime(String input) {
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("HH часов mm минут. Месяц: MM, День: dd, Год: yyyy."); // определите входной формат
                LocalDateTime dateTime = LocalDateTime.parse(input, inputFormatter); // сконвертируйте исходную строку в LocalDateTime

                DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd_MM_yyyy|HH:mm"); // определите выходной формат
                System.out.println(dateTime.format(outputFormatter)); // выведите результат на экран
            }
        }
    }
}
