package hash;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/*public class Practicum {
    public static void main(String[] args) {
        // хеш-таблица содержит информацию о количестве жителей в разных городах
        Map<String, Integer> citiesPopulation = new HashMap<>();
        citiesPopulation.put("Москва", 12_655_050);
        citiesPopulation.put("Лондон", 8_961_989);
        citiesPopulation.put("Нью-Йорк", 8_804_190);

        // попытаемся узнать, каким будет население Парижа через год
        String city = "Париж";
        if (citiesPopulation.containsKey(city)) {
            Integer cityPopulation = citiesPopulation.get(city);
            System.out.println("Через 1 год население города " + city + " будет: " + (int)(cityPopulation * 1.01));
        }
    }
}*/


/*
public class Practicum {
    public static void main(String[] args) {
        // ключ — название задачи, значение — выполнена эта задача или ещё нет
        Map<String, Boolean> todos = new HashMap<>();

        todos.put("Выучить Java", true);
        todos.put("Найти классную работу", false);
       // дополните код, чтобы очистить список задач
        todos.clear();

        System.out.println("Todo-список пуст? Ответ: " + todos.isEmpty());// дополните кодом, который даст верный ответ
    }
}*/



/*
public class Practicum {
    public static void main(String[] args) {
        Map<String, Integer> food = new HashMap<>();

        // добавим продукты
        food.put("Яблоки", 52);
        food.put("Авокадо", 160);
        food.put("Молоко", 50);
        food.put("Сыр", 357);
        food.put("Пицца", 275);

        // выведем содержимое в консоль
        System.out.println("Содержимое холодильника: " + food + ".");

        // проверим, что все любимые продукты на месте
        boolean hasApples = food.containsKey("Яблоки");
        System.out.println("А у нас есть яблоки? 🤔 Ответ: " + hasApples + " 🥳.");

        boolean hasCoconuts = food.containsKey("Кокос");
        System.out.println("А у нас есть кокосы? 🤔 Ответ: " + hasCoconuts + " 😱. Срочно вызываем кокосовый отряд!");

        // а сколько калорий в пицце? Давайте проверим ...
        int caloriesInPizza = food.get("Пицца");
        System.out.println("Пицца содержит " + caloriesInPizza + " калорий на 100 г.");

        // хм, а сколько продуктов в холодильнике? Сейчас посмотрим ...
        System.out.println("Сейчас в холодильнике " + food.size() + " продуктов.");

        // а не съесть ли яблоко?
        food.remove("Яблоки");
        System.out.println("Сейчас в холодильнике " + food.size() + " продукта. Кажется, пора пополнить запасы! 🛒");

        // выведем содержимое холодильника в консоль
        for (Map.Entry<String, Integer> entry : food.entrySet()) {
            System.out.println("'" + entry.getKey() + "' содержит " + entry.getValue() + " калорий в 100 г.");
        }

        food.clear(); // удалим все записи из хеш-таблицы

        // когда в холодильнике пусто ...
        System.out.println("Сейчас в холодильнике " + food.size() + " продуктов.");

        if (food.isEmpty()) {
            System.out.println("Ничего не осталось! Срочно заказываем доставку!");
        } else {
            System.out.println("Всё в порядке!");
        }
    }
}*/




/*
public class Practicum {
    public static void main(String[] args) {
        Map<User, List<String>> userOrders = new HashMap<User, List<String>>();

        userOrders.put(
                new User(97457, "Джо", "joe@black.com"),
                List.of("1928873467463")
        );
        userOrders.put(
                new User(29575, "Лиз", "liz@black.com"),
                List.of(
                        "9828674982082",
                        "7249804867520"
                )
        );
        userOrders.put(
                new User(57860, "Ян", "yan@black.com"),
                List.of("4758039927678")
        );

        System.out.println("Заказы: " + userOrders);
    }
}

class User {
    Integer id;
    String name;
    String email;

    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}*/

/*
public class Practicum {
    // Пример списка пассажиров (на самом деле их больше)
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        // Тут нужно написать код, который будет распределять места в самолёте ✈️
        Map<String, Integer> seats = new HashMap<>();
        for (int i = 0; i < passengerNames.size(); i++) {
            seats.put(passengerNames.get(i), (i + 1));
        }
        return seats;
    }
}*/

/*public class Practicum {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Practicum pizzeria = new Practicum();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        // Сохраните новый заказ в хеш-таблицу. При обновлении счётчика заказов
        // не забудьте учесть заказы, которые уже были сделаны ранее.
        int counter = orders.getOrDefault(clientName, 1);
        if (orders.containsKey(clientName)) {
            counter++;
        }
        orders.put(clientName, counter);
    }

    private void printStatistics() {
        // Выведите собранную статистику в консоль и посчитайте общее количество заказов.
        //
        // Формат для вывода данных в консоль:
        //     Заказов от Микеланджело: 15
        //     Заказов от Леонардо: 4
        //     Всего заказов: 19

        for (Map.Entry<String, Integer> entry : orders.entrySet()) {
            System.out.println("Заказов от " + entry.getKey() + ": " + entry.getValue());
        }

        int sum = 0;

        for (Integer value : orders.values()) {
            sum += value;
        }
        System.out.println("Всего заказов: " + sum);
    }
}*/

/*public class Practicum {
    public static void main(String[] args) {
        // ключ – автомобиль, значение – цена
        Map<Car, Integer> cars = new TreeMap<>();

        // хеш-таблица заполняется данными
        cars.put(new Car("Audi A6", 3_760_000), 2);
        cars.put(new Car("Honda CR-V ", 2_500_000), 3);
        cars.put(new Car("KIA Cerato", 1_300_000), 8);
        cars.put(new Car("Volkswagen Tiguan", 1_935_000), 5);

        // проверяем порядок
        for (Car car : cars.keySet()) {
            System.out.println(car);
        }
    }
}

class Car implements Comparable<Car> {
    String model;
    Integer priceInRubles;

    public Car(String model, Integer priceInRubles) {
        this.model = model;
        this.priceInRubles = priceInRubles;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return model.equals(car.model);
    }

    public int hashCode() {
        return model.hashCode();
    }

    public String toString() {
        return "Car{model=" + model + ", priceInRubles=" + priceInRubles + "}";
    }

    @Override
    public int compareTo(Car o) {
        return this.priceInRubles - o.priceInRubles;
    }
}*/

/*public class Practicum {
    public static void main(String[] args) {
        List<String> actorsList = new ArrayList<>();
        fillActors(actorsList);

        Map<String, Integer> actorsMap = new LinkedHashMap<>();
        // заполните хэш-таблицу
        for (String actor : actorsList) {
            actorsMap.put(actor, actorsMap.getOrDefault(actor, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : actorsMap.entrySet()) {
            String actor = entry.getKey();
            int filmsCount = entry.getValue();
            System.out.println(actor + " снялся в " + filmsCount + " фильмах");
        }
    }

    private static void fillActors(List<String> actors) {
        actors.add("Шон Коннери");     // 1962 Доктор Ноу
        actors.add("Шон Коннери");     // 1963 Из России с любовью
        actors.add("Шон Коннери");     // 1964 Голдфингер
        actors.add("Шон Коннери");     // 1965 Шаровая молния
        actors.add("Шон Коннери");     // 1967 Живёшь только дважды
        actors.add("Джордж Лэзенби");  // 1969 На секретной службе Её Величества
        actors.add("Шон Коннери");     // 1971 Бриллианты навсегда
        actors.add("Роджер Мур");      // 1973 Живи и дай умереть
        actors.add("Роджер Мур");      // 1974 Человек с золотым пистолетом
        actors.add("Роджер Мур");      // 1977 Шпион, который меня любил
        actors.add("Роджер Мур");      // 1979 Лунный гонщик
        actors.add("Роджер Мур");      // 1981 Только для твоих глаз
        actors.add("Роджер Мур");      // 1983 Осьминожка
        actors.add("Роджер Мур");      // 1985 Вид на убийство
        actors.add("Тимоти Далтон");   // 1987 Искры из глаз
        actors.add("Тимоти Далтон");   // 1989 Лицензия на убийство
        actors.add("Пирс Броснан");    // 1995 Золотой глаз
        actors.add("Пирс Броснан");    // 1997 Завтра не умрёт никогда
        actors.add("Пирс Броснан");    // 1999 И целого мира мало
        actors.add("Пирс Броснан");    // 2002 Умри, но не сейчас
        actors.add("Дэниел Крейг");    // 2006 Казино «Рояль»
        actors.add("Дэниел Крейг");    // 2008 Квант милосердия
        actors.add("Дэниел Крейг");    // 2012 007: Координаты «Скайфолл»
        actors.add("Дэниел Крейг");    // 2015 007: Спектр
        actors.add("Дэниел Крейг");    // 2021 Не время умирать
    }
}*/

/*
class Practicum {
    private static Map<Long, User> users = new HashMap<>();

    public static void main(String[] args) {
        // создадим 1 миллион пользователей
        for (long i = 1; i <= 1_000_000L; i++) {
            users.put(i, new User(i, "Имя " + i));
        }

        final long startTime = System.nanoTime();
        User user = findUser(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
    }

    private static User findUser(Long userId) {
        return users.get(userId);
    }

    static class User {
        Long id;
        String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "User{id=" + id + ", name='" + name + "'}";
        }
    }
}
*/

/*
class Practicum {
    private static List<String> allPurchases = List.of(
            "яблоки",
            "молоко",
            "колбаса",
            "огурцы",
            "сок",
            "хлеб",
            "виноград",
            "молоко",
            "йогурт",
            "хлеб",
            "пельмени"
    );

    public static void main(String[] args) {
        // переменная uniquePurchases должна содержать множество уникальных товаров
        Set<String> uniquePurchases = findUniquePurchases(allPurchases);

        // допишите вывод количества уникальных товаров
        System.out.println( "За месяц было куплено " + uniquePurchases.size() + " уникальных товаров.");
    }

    // реализуйте этот метод
    public static Set<String> findUniquePurchases(List<String> allPurchases) {
        Set<String> uniquePurchases = new HashSet<>(allPurchases);
        return uniquePurchases;
    }
}*/

/*
public class Practicum {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        fillNames(names);
        System.out.println("Общее количество имён: " + names.size());

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Количество уникальных имён: " + uniqueNames.size());
    }

    private static void fillNames(List<String> names) {
        names.add("Максим");
        names.add("Светлана");
        names.add("Иван");
        names.add("Ольга");
        names.add("Максим");
        names.add("Пётр");
        names.add("Олег");
        names.add("Иван");
        names.add("Ольга");
        names.add("Ирина");
    }
}*/

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/*
public class Practicum {
    public static void main(String[] args) {
        Set<String> songs = new LinkedHashSet<>();
        fillSongs(songs);

        System.out.println("Количество песен: " + songs.size());

        System.out.println("Песни:");
        for (String song : songs) {
            System.out.println("  * " + song);
        }

    }

    private static void fillSongs(Set<String> songs) {
        songs.add("Sting – Shape Of My Heart");
        songs.add("Gorillaz – Clint Eastwood");
        songs.add("Lady Gaga – Bad Romance");
        songs.add("Taylor Swift – Wildest Dreams");
        songs.add("Ariana Grande – 7 rings");
        songs.add("Depeche Mode – Personal Jesus");
        songs.add("Gorillaz – Clint Eastwood");
        songs.add("Lady Gaga – Bad Romance");
        songs.add("Bruno Mars – Talking To The Moon");
        songs.add("Taylor Swift – Wildest Dreams");
    }
}*/

/*
public class Practicum {
    public static void main(String[] args) {
        Comparator<Ticket> comparator = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o1.priceInUsd - o2.priceInUsd;
            }
        };

        Set<Ticket> tickets = new TreeSet<>(comparator);
        fillTickets(tickets);

        System.out.println("Доступные билеты: ");
        for (Ticket ticket : tickets) {
            System.out.println("  * " + ticket);
        }
    }

    private static void fillTickets(Set<Ticket> tickets) {
        tickets.add(new Ticket("Лондон", "Париж", 376));
        tickets.add(new Ticket("Милан", "Москва", 298));
        tickets.add(new Ticket("Берлин", "Бостон", 1273));
        tickets.add(new Ticket("Пекин", "Рим", 846));
        tickets.add(new Ticket("Санкт-Петербург", "Афины", 284));
        tickets.add(new Ticket("Сидней", "Токио", 1738));
        tickets.add(new Ticket("Мюнхен", "Дубай", 974));
    }

    public static class Ticket {
        public String from;
        public String to;
        public int priceInUsd;

        public Ticket(String from, String to, int priceInUsd) {
            this.from = from;
            this.to = to;
            this.priceInUsd = priceInUsd;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ticket ticket = (Ticket) o;

            if (priceInUsd != ticket.priceInUsd) return false;
            if (!from.equals(ticket.from)) return false;
            if (!to.equals(ticket.to)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = from.hashCode();
            result = 31 * result + to.hashCode();
            result = 31 * result + priceInUsd;
            return result;
        }

        @Override
        public String toString() {
            return "Ticket{from=" + from + ", to=" + to + ", priceInUsd=" + priceInUsd + '}';
        }
    }
}*/

public class Practicum {
    private static Set<Letter> letters = new LinkedHashSet<>();

    public static void main(String[] args) {
        // информация о письмах (в порядке занесения в систему)
        letters.add(new Letter("Джон Смит", LocalDate.of(2021, 7, 7), "текст письма №1 ..."));
        letters.add(new Letter("Аманда Линс", LocalDate.of(2021, 6, 17), "текст письма №2 ..."));
        letters.add(new Letter("Джо Кью", LocalDate.of(2021, 7, 5), "текст письма №3 ..."));
        letters.add(new Letter("Мишель Фернандес", LocalDate.of(2021, 8, 23), "текст письма №4 ..."));

        printOrderedById(letters);
        printOrderedByDateReceived(letters);
    }

    private static void printOrderedById(Set<Letter> letters) {
        System.out.println("Все письма с сортировкой по ID: ");

        for (Letter letter : letters) {
            System.out.println("    * Письмо от " + letter.authorName + " поступило " + letter.dateReceived);
        }
    }

    private static void printOrderedByDateReceived(Set<Letter> letters) {
        System.out.println("Все письма с сортировкой по дате получения: ");

        // реализуйте этот метод
        Set<Letter> letterSet = new TreeSet<>(Comparator.comparing(l -> l.dateReceived));
        letterSet.addAll(letters);

        for (Letter letter : letterSet) {
            System.out.println("    * Письмо от " + letter.authorName + " поступило " + letter.dateReceived);
        }
    }

    static class Letter {
        public String authorName;      // имя отправителя
        public LocalDate dateReceived; // дата получения письма
        public String text;            // текст письма

        public Letter(String senderName, LocalDate dateReceived, String text) {
            this.authorName = senderName;
            this.dateReceived = dateReceived;
            this.text = text;
        }
    }
}