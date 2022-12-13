package Java0Tutor.OneDimensionalArrays.Task07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void func() {

        System.out.println("7. Даны действительные числа n a ,a , ,a 1 2. Найти\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int[] array = new int[a];

        Arrays.setAll(array, i -> ((int) (Math.random() * 100) - 50));

        System.out.print(Arrays.toString(array) + "\n" + "\n");

        int maxSum = array[0] + array[array.length - 1];

        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }
        }
        System.out.println("Сумма равна " + maxSum);
    }


    public static void main(String[] args) {
        func();

    }
}

