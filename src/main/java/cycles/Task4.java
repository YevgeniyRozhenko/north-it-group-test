package cycles;

import java.util.Scanner;

/*
Пользователь вводит число. Выводим в консоль факториал этого числа
 */
public class Task4 {
    public static void main(String[] args) {
        getFactorial();
    }

    private static void getFactorial() {
        Scanner scr = new Scanner(System.in);
        int inputNum = scr.nextInt();
        int sum = inputNum;
        for (int i = inputNum - 1; i > 0; i--) {
            sum *= i;
        }
        System.out.println(String.format("!%s = %s", inputNum, sum));
    }
}
