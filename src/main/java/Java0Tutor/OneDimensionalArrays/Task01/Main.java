package Java0Tutor.OneDimensionalArrays.Task01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void mulsum() {
        System.out.println("1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
//        while (!scanner.hasNextInt()) {
//            System.out.println("Введите размер массива больше единицы!");
//            }
        int[] array = new int[n];

        System.out.println("Введите натуральное число: k ");
        int k = scanner.nextInt();
//        while (!scanner.hasNextInt()) {
//            System.out.println("Вы ввели не натуральное число!");
//            }

        Arrays.setAll(array, i -> (int) (Math.random() * 50));
        System.out.println(Arrays.toString(array) + "\n");

        int sum = Arrays.stream(array)
                .filter(value -> value % k == 0)
                .sum();
        System.out.print("Cумма элементов, которые кратны " + k + " равно " + sum);
    }

    public static void main(String[] args) {
        mulsum();


    }
}
