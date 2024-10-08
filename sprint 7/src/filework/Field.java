package filework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Field {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество участников: ");
        int playersNumber = scanner.nextInt();

        List<String> words = readWordsFromFile("words.txt");

        // если слов меньше, чем участников, то выведите сообщение:
        if (words.size() < playersNumber || words.size() % playersNumber != 0) {
            System.out.println("Недостаточно слов в файле. Добавьте слова и обновите файл.");
            return;
        }  // "Недостаточно слов в файле. Добавьте слова и обновите файл."
        // и завершите выполнение программы

        Collections.shuffle(words);
        // воспользуйтесь статическим методом Collections.shuffle(List<?> list),
        // чтобы поменять порядок слов случайным образом

        int wordsNumber = words.size() / playersNumber;

        for (int i = 0; i < playersNumber; i++) {
            String filename = String.format("player%s.txt", i + 1);
            List<String> subList = words.subList(i * wordsNumber, (i + 1) * wordsNumber);

            writeListToFile(subList, filename);
        }

        System.out.println("Карточки готовы!");
    }

    private static List<String> readWordsFromFile(String filename) throws IOException {
        // добавьте построчное чтение из файла с помощью BufferedReader
        List<String> words = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename, StandardCharsets.UTF_8))) {
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                words.add(line);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка во время чтения файла.");
            // в случае ошибки выведите сообщение: "Произошла ошибка во время чтения файла."
        }
        return words;
    }

    private static void writeListToFile(List<String> list, String filename) throws IOException {
        // добавьте запись слов в файл с помощью FileWriter
       try (Writer fileWriter = new FileWriter(filename, StandardCharsets.UTF_8)) {
           for (String word : list) {
               fileWriter.write(word + "\n");
           }
       } catch (IOException e) {
           System.out.println("Произошла ошибка во время записи файла."); // в случае ошибки выведите сообщение: "Произошла ошибка во время записи файла."
       }
    }
}
