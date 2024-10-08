package funcstyle;

public class Practicum {
    public static void main(String[] args) {
        // Доработайте данный метод, чтобы на экран выводилось
        // сообщение в соответствии с заданием

        SearchService searchService = new SearchService();

        searchService.search("Африка").ifPresentOrElse(candy ->
                        System.out.println(String.format("Товар %s доступен в количестве %d кг по цене %.2f руб за кг",
                                candy.name, candy.amount, candy.price)),
                () -> System.out.println("Данный товар не найден"));
    }
}

