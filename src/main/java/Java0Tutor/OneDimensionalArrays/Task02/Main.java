package Java0Tutor.OneDimensionalArrays.Task02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void changeValueMoreThenKey() {

        System.out.println("2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int [] array = new int[a];

        System.out.println("Введите натуральное число ");
        int b = scanner.nextInt();

        Arrays.setAll(array, i -> (int) (Math.random() * 10));

        System.out.print(Arrays.toString(array) + "\n");

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > b) {
                array[i] = b;
                ++count;
            }
        }
        System.out.print(Arrays.toString(array) + "\n" + "\n" + "Количество замен равно " + count);
    }

    public static void main(String[] args) {
        changeValueMoreThenKey();

    }
}

