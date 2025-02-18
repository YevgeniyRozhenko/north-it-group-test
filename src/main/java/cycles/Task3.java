package cycles;

import java.util.Scanner;

/*
Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с
индексом х
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946
 */
public class Task3 {
    public static void main(String[] args) {
        getFibonacciNumberByIndex();
    }

    private static void getFibonacciNumberByIndex() {
        Scanner scr = new Scanner(System.in);
        int xNum = Math.abs(scr.nextInt());
        int sum = 1;
        int buff;
        int previous = 0;
        for (int i = 0; i < xNum; i++) {
            buff = sum;
            sum += previous;
            previous = buff;
        }
        System.out.println(previous);
    }
}
