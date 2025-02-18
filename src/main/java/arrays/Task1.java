package arrays;

import java.util.Arrays;

/*
Дан массив с целыми числами. Вывести в консоль количество положительных и
отрицательных чисел в нем
 */
public class Task1 {
    public static void main(String[] args) {
        printCountDeterminingNumberSignTypes(new int[]{1, 0, -56, 184, -99, 3});
    }

    private static void printCountDeterminingNumberSignTypes(int[] nums) {
        int positive = (int) Arrays.stream(nums).filter(num -> num > 0).count();
        int negative = (int) Arrays.stream(nums).filter(num -> num < 0).count();
        System.out.println("положительных чисел: " + positive + "\nотрицательных чисел: " + negative);
    }
}
