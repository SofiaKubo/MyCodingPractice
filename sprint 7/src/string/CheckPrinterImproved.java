package string;

import java.util.Scanner;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        String[] titles = new String[items.length];
        String[] numbers = new String[items.length];
        String[] prices = new String[items.length];

        for (int i = 0; i < items.length; i++) {
            String[] str = items[i].split(", ");
            titles[i] = str[0];
            numbers[i] = str[1];
            prices[i] = str[2];
        }

        int maxTitle = findMaxLength(titles);
        int maxNumber = findMaxLength(numbers);
        int maxPrice = findMaxLength(prices);

        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-" + maxTitle + "s  %-" + maxNumber + "s  %-" + maxPrice + "s%n",
                    titles[i], numbers[i], prices[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i = 0; i < n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}
