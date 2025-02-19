package cycles;

import java.util.Random;

/*
Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по
диагонали от [0][0] до [10][10]
 */
public class Task6 implements RandomlyFillable {
    public static void main(String[] args) {
        int[][] nums = RandomlyFillable.fillOutTwoDimensionalArray(new int[10][10], 101);
        printTwoDimensionalArray(nums);
    }

    private static void printTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
    }
}
