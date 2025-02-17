package conditional_operators;

import java.util.Scanner;

/*
Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
наибольшего и наименьшего из них
 */
public class Task6 {
    public static void main(String[] args) {
        printSumBetweenBiggestAndSmallest();
    }

    private static void printSumBetweenBiggestAndSmallest() {
        Scanner scr = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scr.nextInt();
        }
        int biggestNum = nums[0];
        int smallestNum = nums[0];
        for (int num : nums) {
            if (num >= biggestNum) {
                biggestNum = num;
            } else if (smallestNum > num) {
                smallestNum = num;
            }
        }
        System.out.println(biggestNum + " + " + smallestNum + " = " + (biggestNum + smallestNum));
    }
}
