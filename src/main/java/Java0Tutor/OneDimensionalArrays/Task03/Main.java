package Java0Tutor.OneDimensionalArrays.Task03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void countElems() {

        System.out.println("3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int [] array = new int[a];
        Arrays.setAll(array, i -> ((int) (Math.random() * 100) - 50));
        System.out.print(Arrays.toString(array) + "\n" + "\n");

        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                ++countNegative;
            } else if (array[i] > 0) {
                ++countPositive;
            } else {
                ++countZero;
            }
        }
        System.out.println("Количество отрицательных элементов равно " + countNegative);
        System.out.println("Количество положительных элементов равно " + countPositive);
        System.out.println("Количество нулевых элементов равно " + countZero);

    }

    public static void main(String[] args) {
        countElems();

    }
}

