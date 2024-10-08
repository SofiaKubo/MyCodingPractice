package funcstyle;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Candi {
    //название
    final String name;
    //производитель
    final String producer;
    //цена
    final int price;
    //проданное количество
    final int amountSold;
    //другие варианты названия
    final Set<String> alternateNames;

    public Candi(String name, String producer, int price, int amountSold, Collection<String> alternateNames) {
        this.name = name; this.producer = producer; this.price = price;
        this.amountSold = amountSold; this.alternateNames = Set.copyOf(alternateNames);
    }

    public static int compareByName(Candi c1, Candi c2) {
        return c1.name.compareTo(c2.name);
    }
}

class CandyBox {
    final String boxTitle;
    final List<Candi> candies;
    final long numberOfCandies;

    private static final List<String> prohibitedProducers = List.of("Триумф");

    //добавьте конструктор
    public CandyBox(String boxTitle, List<Candi> candies) {
        this.boxTitle = boxTitle; this.candies = candies; this.numberOfCandies = candies.size();
    }

    public static boolean isProducerAllowed(Candi candy) {
        //добавьте тело метода
        return !(prohibitedProducers.contains(candy.producer));
    }

    public void printContent() {
        System.out.println("Набор " + boxTitle + ", содержит " + numberOfCandies + " конфет");
        candies.forEach(candy -> System.out.println(candy.name + " производства " + candy.producer + ", цена: " + candy.price));
    }
}

public class CandyBoxesStore {

    public static void main(String[] args) {
        Candi candy1 = new Candi("Мишка на севере", "Первая кондитерская фабрика", 28, 4, Set.of("Мишка косолапый", "Мишка"));
        Candi candy2 = new Candi("Мишка в лесу", "Триумф", 32, 2, Set.of("Мишка косолапый"));
        Candi candy3 = new Candi("Трюфель", "Триумф", 44, 5, Set.of("Трюфель классический", "Трюфель шоколадный"));
        Candi candy4 = new Candi("Победа", "Первая кондитерская фабрика", 14, 12, Set.of("ПОБЕДА"));

        List<Candi> candies = List.of(candy1, candy2, candy3, candy4);

        List<Candi> candiesForBox = candies.stream() //добавьте код здесь
                .filter(CandyBox::isProducerAllowed)
                .map(candy -> new Candi(candy.name, candy.producer, candy.price - 5, candy.amountSold, candy.alternateNames))
                .sorted(Candi::compareByName)
                .toList();

        CandyBox candyBox = new CandyBox("С Новым Годом", candiesForBox);

        candyBox.printContent();
    }
}
