package string;

import java.util.Scanner;

public class CheckPrinter {
    public static void printCheck(String[] items) {
        for (String item: items) {
            String[] str = item.split(", ");
            System.out.printf("%-15s", str[0]);
            System.out.printf("%-15s", str[1]);
            System.out.println(str[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i=0; i<n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}
