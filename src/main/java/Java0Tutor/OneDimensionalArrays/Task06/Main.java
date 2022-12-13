package Java0Tutor.OneDimensionalArrays.Task06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void func() {

        System.out.println("6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int[] array = new int[a];

        Arrays.setAll(array, i -> ((int) (Math.random() * 100) - 50));

        System.out.print(Arrays.toString(array) + "\n" + "\n");

        double sum = 0;
        Out:
        for (int i = 2; i <= a; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue Out;
                }
            }
            sum += array[i];
            System.out.println("Простое число - " + i + " элемент массива - " + array[i]);
        }
        System.out.println("\n" + "Сумма равна " + sum);
    }


    public static void main(String[] args) {
        func();

    }
}

