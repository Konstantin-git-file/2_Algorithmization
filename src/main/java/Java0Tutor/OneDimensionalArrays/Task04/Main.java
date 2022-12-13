package Java0Tutor.OneDimensionalArrays.Task04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void minmaxElems() {

        System.out.println("4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int[] array = new int[a];
        Arrays.setAll(array, i -> ((int) (Math.random() * 100) - 50));
        System.out.print(Arrays.toString(array) + "\n" + "\n");

        int min = 0;
        int max = 0;
        int swap;

        int i = 0;
        while (i < array.length) {
            if (array[max] < array[i])
                max = i;
            if (array[min] > array[i])
                min = i;
            i++;
        }
        System.out.println("Наибольший элемент " + array[max] + "\n" + "Наименьший элемент " + array[min] + "\n");

        swap = array[max];
        array[max] = array[min];
        array[min] = swap;

        System.out.print("Массив после изменений " + "\n" + Arrays.toString(array) + "\n");

    }

    public static void main(String[] args) {
        minmaxElems();

    }
}

