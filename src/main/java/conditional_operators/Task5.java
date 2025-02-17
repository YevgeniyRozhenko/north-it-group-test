package conditional_operators;

import java.util.Scanner;

/*
Пользователь вводит в консоли три числа, выводим самое большое из них.
 */
public class Task5 {
    public static void main(String[] args) {
        printBiggestNumber();
    }

    private static void printBiggestNumber() {
        Scanner scr = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scr.nextInt();
        }
        int biggestNum = nums[0];
        for (int num : nums) {
            if (num >= biggestNum) {
                biggestNum = num;
            }
        }
        System.out.println("Самое большое вводимое число: " + biggestNum);
    }
}
