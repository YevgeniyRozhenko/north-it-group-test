package arrays;

import java.util.Arrays;

/*
Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные
значения)
 */
public class Task3 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 4, 19, -20, 682};
        printSumOfEvenValues(nums);
        System.out.println("2nd ver: " + Arrays.stream(nums).filter(num -> num % 2 == 0).sum());
    }

    private static void printSumOfEvenValues(int[] nums) {
        int sum = 0;
        for (int i = 0, buff; i < nums.length; i++) {
            buff = nums[i];
            if (buff % 2 == 0) {
                sum += buff;
            }
        }
        System.out.println(sum);
    }
}
