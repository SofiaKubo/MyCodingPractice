package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


/*public class Practicum {
    public static void main(String[] args) {
        //создаём двухуровневую хеш-таблицу для хранения расписания уроков
        AdvancedHashMap<String, Integer, String> timetable = new AdvancedHashMap<>();
        //добавляем уроки, с указанием дня недели и номера урока
        timetable.put("Понедельник", 1, "Русский язык");
        timetable.put("Понедельник", 2, "Математика");
        timetable.put("Вторник", 1, "Физкультура");
        timetable.put("Вторник", 2, "Русский язык");

        //выводим первый урок во вторник
        System.out.println(timetable.get("Вторник", 1));

        //получаем и выводим все уроки в понедельник
        ArrayList<String> mondayLessons = timetable.getAll("Понедельник");
        System.out.println(mondayLessons);
    }

}

class AdvancedHashMap<K1, K2, V> {
    //данные будем хранить в хеш-таблице из хеш-таблиц
    HashMap<K1, HashMap<K2, V>> internalHashMap = new HashMap<>();

    public void put(K1 weekday, K2 lessonNumber, V schoolSubject) {
        //получаем хеш-таблицу по первому ключу
        HashMap<K2, V> innerHashMap = internalHashMap.get(weekday);
        if (innerHashMap == null) {
            //вложенной хеш-таблицы по первому ключу пока нет — создаём её и добавляем в internalHashMap
            innerHashMap = new HashMap<>();
            internalHashMap.put(weekday, innerHashMap);
        }
        //добавляем элемент во вложенную хеш-таблицу
        innerHashMap.put(lessonNumber, schoolSubject);
    }

    public V get(K1 weekday, K2 lessonNumber) {
        //получаем хеш-таблицу по первому ключу
        HashMap<K2, V> innerHashMap = internalHashMap.get(weekday);
        if (innerHashMap == null) {
            return null;
        }
        //получаем элемент из вложенной хеш-таблицы
        return innerHashMap.get(lessonNumber);
    }

    public ArrayList<V> getAll(K1 weekday) {
        HashMap<K2, V> innerHashMap = internalHashMap.get(weekday);
        if (innerHashMap == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(innerHashMap.values());
    }
}*/

/*public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Заполните данные для ипотечной заявки и узнайте статус одобрения");
        System.out.println("Введите ФИО:");
        String name = scanner.nextLine();

        System.out.println("Ваш возраст:");
        byte age = scanner.nextByte();

        System.out.println("Планируемая сумма ипотеки:");
        int mortgageAmount = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Трудоустроены ли вы сейчас? (д/н)");
        String employedString = scanner.nextLine();
        boolean employed = employedString.equalsIgnoreCase("д");

        MortgageRequest mortgageRequest = new MortgageRequest(name, age, mortgageAmount, employed);
        mortgageRequest.validate();

    }
}*/

/*
public class Practicum {

    public static void main(String[] args) {
        // первый магазин продаёт дорогие товары и хочет передавать копейки типом Long
        ArrayList<Long> longList = new ArrayList<>();
        longList.add(Long.MAX_VALUE);

        new Printer<>(longList).print();

        // второй магазин продаёт товары подешевле и использует для передачи копеек тип Integer
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100000);

        new Printer<>(intList).print();

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");

        // этот вариант должен вызывать ошибку компиляции
        // new Printer<>(stringList).print();
    }

}

class Printer<T extends Number> {
    private final ArrayList<T> list;

    public Printer(ArrayList<T> list) {
        this.list = list;
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            double price = list.get(i).doubleValue() / 100;
            System.out.println("Цена товара: " + price + " руб.");
        }
    }
}*/


/*
public class Practicum {

    public static void main(String[] args) {
        AnswerHolder<Number> elephantAnswer = new AnswerHolder<>("Сколько весит слон в тоннах", 5);
        elephantAnswer.printSmart();

        HashMap<String, Double> bigRussianEncyclopedia = new HashMap<>();
        bigRussianEncyclopedia.put("Сколько часов в сутках", (double) 24);
        bigRussianEncyclopedia.put("Сколько весит слон в тоннах", 4.3);

        elephantAnswer.replaceAnswer(bigRussianEncyclopedia);
        elephantAnswer.printSmart();

        HardQuestion elephantVolumeQuestion = new HardQuestion("Как вычислить объём слона с помощью подручных средств?");
        elephantVolumeQuestion.printSmart();

        ArrayList<SmartPrintable> printables = new ArrayList<>();
        printables.add(elephantAnswer);
        printables.add(elephantVolumeQuestion);
        System.out.println("Всё, что можно распечатать: ");
        print(printables);

        ArrayList<AnswerHolder<Number>> answers = new ArrayList<>();
        answers.add(elephantAnswer);
        System.out.println("Лучшие ответы на вопросы: ");
        print(answers);
    }

    public static void print(ArrayList<? extends SmartPrintable> values) {
        for (SmartPrintable value : values) {
            value.printSmart();
        }
    }
}


interface SmartPrintable {
    void printSmart();
}


class AnswerHolder<T extends Number> implements SmartPrintable {
    String question;
    T answer;

    public AnswerHolder(String question, T answer) {
        this.question = question;
        this.answer = answer;
    }

    public void replaceAnswer(HashMap<String, ? extends T> bigRussianEncyclopedia) {
        //метод должен замещать значение answer значением, полученным из аргумента - хеш-таблицы, для данного вопроса
        if (bigRussianEncyclopedia.containsKey(question)) {
            this.answer = bigRussianEncyclopedia.get(question);
        }
    }

    @Override
    public void printSmart() {
        System.out.println("Ответ на вопрос '" + question + "' равен " + answer.intValue());
    }
}


class HardQuestion implements SmartPrintable {
    String questionText;

    public HardQuestion(String questionText) {
        this.questionText = questionText;
    }


    @Override
    public void printSmart() {
        System.out.println("Текст очень сложного вопроса: " + questionText);
    }
}*/

public class Practicum {

    // Дополните объявление поля friendsContactBook, которое будет хранить в себе список номеров телефонов друзей
    private static ContactBook<Phone> friendsContactBook = new ContactBook<>();
    private static ContactBook<Email> colleaguesContactBook = new ContactBook<>();
    private static ContactBook<SocialNetworkContact> classmatesContactBook = new ContactBook<>();
    private static ContactBook<Address> relativesContactBook = new ContactBook<>();
    // Напишите объявления полей colleaguesContactBook, classmatesContactBook и relativesContactBook,
    // которые будут хранить списки электронных адресов, соцсетей и почтовых адресов соответственно

    public static void main(String[] args) {
        fillBooks();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Сегодня Новый Год! 1 - Отправить поздравление, 0 - Напомнить позднее");
            int mainCommand = scanner.nextInt();
            if (mainCommand == 1) {
                System.out.println("Какую книгу контактов открыть?");
                System.out.println("1 - Друзья, 2 - Коллеги, 3 - Одногруппники, 4 - Родственники");

                int bookIndex = scanner.nextInt();
                if (bookIndex == 1) {
                    friendsContactBook.printList();
                } else if (bookIndex == 2) {
                    colleaguesContactBook.printList();
                } else if (bookIndex == 3) {
                    classmatesContactBook.printList();
                } else if (bookIndex == 4) {
                    relativesContactBook.printList();
                }

                System.out.println("Кого вы хотите поздравить? Введите имя:");
                String name = scanner.next();
                if (bookIndex == 1) {
                    friendsContactBook.congratulate(name);
                } else if (bookIndex == 2) {
                    colleaguesContactBook.congratulate(name);
                } else if (bookIndex == 3) {
                    classmatesContactBook.congratulate(name);
                } else if (bookIndex == 4) {
                    relativesContactBook.congratulate(name);
                }
            } else if (mainCommand == 0) {
                break;
            }
        }
    }

    private static void fillBooks() {
        friendsContactBook.addContact(new Phone("Иван", "+7-909-000-11-22"));
        friendsContactBook.addContact(new Phone("Маша", "+7-999-555-11-22"));
        friendsContactBook.addContact(new Phone("Кирилл", "+7-979-698-00-22"));

        colleaguesContactBook.addContact(new Email("Александр", "sasha@sasha.ru"));
        colleaguesContactBook.addContact(new Email("Павел", "pasha@pasha.ru"));
        colleaguesContactBook.addContact(new Email("Олег", "oleg@oleg.ru"));

        classmatesContactBook.addContact(new SocialNetworkContact("Оля", "НаСвязи", "olya"));
        classmatesContactBook.addContact(new SocialNetworkContact("Женя", "Фотопризма", "zhenya"));

        relativesContactBook.addContact(new Address("Бабуля", "Москва", "Тверская, д.8"));
        relativesContactBook.addContact(new Address("Дедуля", "Воронеж", "Ленина, д.10"));
    }
}