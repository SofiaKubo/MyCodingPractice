package collections;

/*import java.util.ArrayList;
import java.util.Iterator;

public class Practicum {

    public static void main(String[] args) {
        final ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(" ");
        list.add("World! \n");
        list.add("I'm");
        list.add(" ");
        list.add("here!");

        final Iterator<String> iterator; // объявили объект iterator
        iterator = list.iterator(); // проинициализировали iterator через метод iterator()

        while (iterator.hasNext()) { // проверяем, есть ли следующий элемент в коллекции
            final String element = iterator.next();  // возвращаем элемент
            System.out.print(element);
        }
    }
}*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        RentedFilm film1 = new RentedFilm(
                "Терминатор",
                new DateTime(20, 11, 2021, 10, 0, 0),
                new DateTime(27, 11, 2021, 23, 58, 58)
        );
        System.out.println("Фильм Терминатор взят в аренду: " + film1.getTimeOfRent());
        System.out.println("Фильм должен быть вернут до: " + film1.getTimeOfReturn());


        DateTime today = new DateTime(27, 11, 2021, 23, 58, 59);

        System.out.println("Сегодняшнее число: " + today);

        DateTimeComparator comparator = new DateTimeComparator();
        boolean shouldAlreadyBeReturned = comparator.compare(today, film1.getTimeOfReturn()) > 0;

        System.out.println("Прошло ли время возврата? " + (shouldAlreadyBeReturned ? "Да!" : "Нет!"));
    }
}

/*
class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("hamster");
        animals.add("dog");
        animals.add("bo");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

    }
}

class StringLengthComparator implements Comparator<String > {

    @Override
    public int compare(String o1, String o2) {
        */
/*
        o1 > 02 => 1;
        01 < 02 => -1;
        01 == 02 => 0;
         *//*

        return o1.length() - o2.length();
    }
}*/
