package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practise {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        //System.out.println(time);
        DateTimeFormatter formatterO = DateTimeFormatter.ofPattern("День:d Месяц:MMMM Год:YYYY");
        String formattedTime = time.format(formatterO);
        //System.out.println(formattedTime);

        LocalDateTime dateTime = LocalDateTime.parse("2021-12-21T21:21:21");
        System.out.println(dateTime);

        DateTimeFormatter oneFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH-mm");
        LocalDateTime oneDateTime = LocalDateTime.parse("22-02-2022, 22-22", oneFormatter);
        System.out.println(oneDateTime);

        DateTimeFormatter twoFormatter = DateTimeFormatter.ofPattern("dd*MM*yyyy, HH*mm");
        LocalDateTime twoDateTime = LocalDateTime.parse("22*02*2022, 22*22", twoFormatter);
        System.out.println(oneDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");

        LocalDateTime anotherDateTime = LocalDateTime.parse("22.02.2022, 22:22", formatter);
        System.out.println(anotherDateTime);

        //System.out.println(dateTime.isAfter(anotherDateTime));
    }
}
