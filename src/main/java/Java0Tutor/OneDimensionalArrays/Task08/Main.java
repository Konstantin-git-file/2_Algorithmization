package Java0Tutor.OneDimensionalArrays.Task08;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void func() {

        System.out.println("8. Дана последовательность целых чисел n a ,a , ,a 1 2. Образовать новую последовательность, выбросив из исходной те члены, которые равны min( , , , ) 1 2 n a a.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int a = scanner.nextInt();

        int[] array = new int[a];
        Arrays.setAll(array, i -> ((int) (Math.random() * 100) - 50));
        System.out.print(Arrays.toString(array) + "\n" + "\n");

        int min = Arrays.stream(array)
                .min()
                .getAsInt();

        int [] b = Arrays.stream(array)
                .filter(i -> i != min)
                .toArray();

        System.out.println(Arrays.toString(b));

        }


    public static void main(String[] args) {
        func();

    }
}

