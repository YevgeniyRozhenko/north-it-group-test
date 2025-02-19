package cycles;

import java.util.Random;

/*
Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по
диагонали от [0][10] до [10][0]
 */
public class Task7 implements RandomlyFillable {
    public static void main(String[] args) {
        int[][] nums = RandomlyFillable.fillOutTwoDimensionalArray(new int[10][10], 101);
        printTwoDimensionalArray(nums);
    }

    private static void printTwoDimensionalArray(int[][] array) {
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            System.out.print(array[i][j] + " ");
        }
    }
}
