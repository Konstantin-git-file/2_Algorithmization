package Java0Tutor.OneDimensionalArrays.Task05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void soutOnly() {

        System.out.println("5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int[] array = new int[a];

        Arrays.setAll(array, i -> ((int) (Math.random() * 100) - 50));

        System.out.print(Arrays.toString(array) + "\n" + "\n");

        Arrays.stream(array)
                .filter(b -> b > array.length)
                .mapToObj(b -> b + ",")
                .forEach(System.out::print);
    }

    public static void main(String[] args) {
        soutOnly();

    }
}

