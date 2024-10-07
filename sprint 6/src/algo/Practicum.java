package algo;

/*public class Practicum {

    public static void main(String[] args) {
        int[] array = new int[] {1, 9, 2, 9, 10, 10};

        boolean duplicateFound = false;
        for (int i = 0; i < array.length && !duplicateFound; i++) {
            for (int j = 0; j < array.length; j++) {

                // пропускаем одинаковый индекс, чтобы не сравнить элемент с самим собой
                if (j == i) continue;
                if (array[i] == array[j]) {
                    duplicateFound = true;
                    break;
                }
            }
        }

        System.out.println("Дубликат найден: " + duplicateFound);
    }
}*/


/*
public class Practicum {
    public static void main(String[] args) {
        int[] array = {1, 2, 65, 3, 5, 7, 54, 12, 46, 4, 2};
        System.out.println("Индекс искомого элемента: " + find(array, 3));
    }

    public static int find(int[] array, int elem) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                index = i;
                break;
            }
        }
        return index;
    }
}*/


import java.util.Arrays;

/*
public class Practicum {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 12, 13, 20, 22, 24, 30, 32};

        System.out.println("Индекс искомого элемента: " + Arrays.binarySearch(array, 30));
        System.out.println("Индекс искомого элемента: " + findBinary(array, 30));
    }

    public static int findBinary(int[] array, int elem) {
        int index = -1;

        // задаём границы области поиска
        int low = 0;
        int high = array.length - 1;

        // поиск продолжается до тех пор, пока границы заданы правильно:
        // левая граница левее или совпадает с правой и наоборот
        while (low <= high) {

            // вычисляем середину
            int mid = low  + ((high - low) / 2);

            // если элемент в середине меньше искомого — передвигаем левую границу вправо от середины
            if (array[mid] < elem) {
                low = mid + 1;

                // если больше искомого — передвигаем правую границу влево от середины
            } else if (array[mid] > elem) {
                high = mid - 1;

                // если элемент в середине совпадает с искомым, поиск завершается
            } else if (array[mid] == elem) {
                index = mid;
                break;
            }
        }
        return index;
    }
}*/

/*
import java.util.Random;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        System.out.println("Я загадал число. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);
        int userGuess = -1;

        // Считывайте числа от пользователя пока не найдёте число, равное target
        while (userGuess != target) {
            userGuess = s.nextInt();
            if (userGuess < target) {
                System.out.println("Ваше число меньше");
            } else if (userGuess > target) {
                System.out.println("Ваше число больше");
            } else {
                System.out.println("Правильный ответ");
                break;
            }
        }
    }
}*/

import java.util.Arrays;

/*
public class Practicum {
    public static void main(String[] args) {
        int[] array = {7, 4, 2, 0, 1, 3, 4, 9};
        System.out.println(Arrays.toString(array));

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            */
/*
             * К этой строчке массив [0, ..,  j] отсортирован и все его элементы меньше key.
             * В то же время массив [j + 2, .., i] отсортирован и все его элементы больше key.
             * Если вставить key на место j + 1 весь массив [0, .., i] станет отсортированным.
             *//*

            array[j + 1] = key;
        }
    }
}*/

/*
public class Practicum {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 4, 6, 8};
        int[] array2 = new int[]{1, 2, 3, 8, 9};
        int[] resultArray = merge(array1, array2);

        for (int e : resultArray) {
            System.out.print(e + ", ");
        }
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int[] resultArray = new int[leftSize + rightSize];

        // Индексы, по которым идёт итерация
        int left = 0;
        int right = 0;
        int index = 0;

        while (index < resultArray.length) {

            // Если левый индекс больше максимального левого индекса — добавляем элемент из правого подмассива.
            if (left >= leftSize) {
                resultArray[index] = rightArray[right];
                right++;
            }

            // Если правый индекс больше максимального — добавляем элемент из левого подмассива.
            else if (right >= rightSize) {
                // !!! Добавьте ваш код
                resultArray[index] = leftArray[left];
                left++;
            }

            // Если оба текущих индекса внутри своих границ, нужно сравнивать элементы по этим индексам
            // Если элемент в левом массиве меньше — добавляем его и увеличиваем левый индекс.
            else if (leftArray[left] <= rightArray[right]) {
                resultArray[index] = leftArray[left];
                left++;
            }
            // Иначе — делаем то же самое с правым индексом.
            else {
                // !!! Добавьте ваш код
                resultArray[index] = rightArray[right];
                right++;
            }
            index++;
        }
        return resultArray;
    }
}*/
