import exceptions.ValidateException;
import exceptions.ValidateNameException;
import exceptions.ValidatePasswordException;
import storage.PasswordMemoryStorage;
import storage.PasswordStorage;
import validators.NameValidator;
import validators.PasswordLengthValidator;
import validators.PasswordStrengthValidator;
import validators.Validator;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/*class Practicum {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Validator> passwordValidators = List.of(
            new PasswordLengthValidator(5), new PasswordStrengthValidator()
    );

    private static final List<Validator> nameValidators = List.of(new NameValidator()); // поработайте со списком

    public static void main(String[] args) {
        loop();
    }

    public static void loop() {
        while (true) {
            final String action = getAction();
            if ("1".equals(action)) {
                addUser();
            } else if ("2".equals(action)) {
                showUserPassword();
            } else {
                break;
            }
        }
    }

    private static void checkValidatorRules(
            final List<Validator> validators, final String value
    ) throws ValidateException {
        for (Validator validator : validators) {
            validator.validate(value);
        }
    }

    private static void addUser() {
        final PasswordStorage storage = new PasswordMemoryStorage();
        // добавьте отлов исключений ValidateNameException и ValidatePasswordException
        // закройте хранилище
        try {
            storage.open();
            System.out.println("Введите имя пользователя => ");
            final String name = scanner.nextLine();
            checkValidatorRules(nameValidators, name);
            System.out.println("Введите пароль пользователя => ");
            final String password = scanner.nextLine();
            checkValidatorRules(passwordValidators, password);
            storage.store(name, password);
        } catch (ValidateNameException e) {
            System.out.println("Ошибка валидации имени: " + e.getMessage());
        } catch (ValidatePasswordException e) {
            System.out.println("Ошибка валидации пароля: " + e.getMessage());
        } catch (ValidateException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка работы с хранилищем: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    private static void showUserPassword() {
        final PasswordStorage storage = new PasswordMemoryStorage();
        // добавьте отлов исключения ValidateNameException
        // закройте хранилище
        try {
            storage.open();
            System.out.println("Введите имя пользователя => ");
            final String name = scanner.nextLine();
            checkValidatorRules(nameValidators, name);
            final String password = storage.get(name);
            System.out.println(String.format("Пароль пользователя %s = %s", name, password));
        } catch (ValidateNameException e) {
            System.out.println("Ошибка валидации имени: " + e.getMessage());
        } catch (ValidatePasswordException e) {
            System.out.println("Ошибка валидации пароля: " + e.getMessage());
        } catch (ValidateException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка работы с хранилищем: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    private static String getAction() {
        System.out.println("1 - добавить пользователя с паролем");
        System.out.println("2 - отобразить пароль пользователя");
        System.out.println("другие символы - выход");
        System.out.println("Выберите действие => ");
        return scanner.nextLine();
    }
}*/

import java.nio.file.Path;
import java.nio.file.Paths;

/*
public class Practicum {

    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) {

        // создаём объект Path с помощью статического метода get() класса Paths
        Path testFilePath = Paths.get(HOME, "test", "file.txt");

        // выводим информацию о файле
        System.out.println("Информация о файле: ");
        System.out.println(" - имя: " + testFilePath.getFileName());
        System.out.println(" - корневая директория: " + testFilePath.getRoot());
        System.out.println(" - родительская директория: " + testFilePath.getParent());

        // выводим элементы пути
        System.out.println("Элементы пути: ");
        for (Path element : testFilePath) {
            System.out.println(" - элемент пути: " + element);
        }
    }
}*/


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Practicum {

    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) throws IOException {

        // создаём файл testFile
        Path testFile =
                Files.createFile(Paths.get(HOME, "testFile.txt"));

        if (Files.exists(Paths.get(HOME, "testFile.txt"))) {
            System.out.println("Файл успешно создан.");
        }

        // создаём директорию testDirectory
        Path testDirectory =
                Files.createDirectory(Paths.get(HOME, "testDirectory"));
        if (Files.exists(Paths.get(HOME, "testDirectory"))) {
            System.out.println("Директория успешно создана.");
        }

        // перемещаем файл testFile в директорию testDirectory
        testFile = Files.move(testFile,
                Paths.get(HOME, "testDirectory", "testFile.txt"),
                REPLACE_EXISTING);

        if (Files.exists(
                Paths.get(HOME, "testDirectory", "testFile.txt"))) {

            System.out.println("Файл перемещён в testDirectory.");
        }

        // удаляем файл
        Files.delete(testFile);
        if (!Files.exists(
                Paths.get(HOME, "testDirectory", "testFile.txt"))) {

            System.out.println("Тестовый файл удалён.");
        }

        // удаляем пустую директорию
        Files.delete(testDirectory);
        if (!Files.exists(Paths.get(HOME, "testDirectory"))) {
            System.out.println("Директория удалена.");
        }
    }
}