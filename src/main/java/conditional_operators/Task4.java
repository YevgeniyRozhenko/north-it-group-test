package conditional_operators;

import java.util.Scanner;

/*
Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
количество отрицательных и положительных чисел
 */
public class Task4 {
    public static void main(String[] args) {
        printCountDeterminingNumberSignTypes();
    }

    private static void printCountDeterminingNumberSignTypes() {
        Scanner scr = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int inputNum;
        for (int i = 0; i < 4; i++) {
            inputNum = scr.nextInt();
            if (inputNum > 0) {
                positiveCount++;
            } else if (inputNum < 0) {
                negativeCount++;
            }
        }
        System.out.println(String.format("Было введено: позитивных чисел - %s и негативных чисел - %s", positiveCount, negativeCount));
    }
}
