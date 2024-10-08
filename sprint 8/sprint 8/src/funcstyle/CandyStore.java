package funcstyle;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.function.BiConsumer;

class Candyy {
    final String name;
    final String producer;
    final int price;
    final int amountSold;
    final Set<String> alternateNames;

    public Candyy(String name, String producer, int price, int amountSold, Collection<String> alternateNames) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.amountSold = amountSold;
        this.alternateNames = Set.copyOf(alternateNames);
    }

    public static int compareByName(Candyy c1, Candyy c2) {
        return c1.name.compareTo(c2.name);
    }

    public static int compareByPrice(Candyy c1, Candyy c2) {
        return c1.price - c2.price;
    }

    public void printNameWithPrice() {
        System.out.println(String.format("название %s: цена %d", name, price));
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", amountSold=" + amountSold +
                ", alternateNames=" + alternateNames +
                '}';
    }
}

public class CandyStore {
    public static void main(String[] args) {
        Candyy candy1 = new Candyy("Мишка на севере", "Первая кондитерская фабрика", 28, 4, Set.of("Мишка косолапый", "Мишка"));
        Candyy candy2 = new Candyy("Мишка в лесу", "Триумф", 32, 2, Set.of("Мишка косолапый"));
        Candyy candy3 = new Candyy("Трюфель", "Триумф", 44, 5, Set.of("Трюфель классический", "Трюфель шоколадный"));
        Candyy candy4 = new Candyy("Победа", "Первая кондитерская фабрика", 14, 12, Set.of("ПОБЕДА"));

        Candyy[] candies = {candy1, candy2, candy3, candy4};

        System.out.println("Сортировка по имени");
        Arrays.sort(candies, Candyy::compareByName);
        Arrays.stream(candies).forEach(Candyy::printNameWithPrice);

        System.out.println("Сортировка по цене");
        Arrays.sort(candies, Candyy::compareByPrice);
        Arrays.stream(candies).forEach(Candyy::printNameWithPrice);
    }
}
