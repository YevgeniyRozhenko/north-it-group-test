package conditional_operators;

import java.util.Scanner;

/*
Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или нечетное
 */
public class Task7 {
    public static void main(String[] args) {
        printNumberParity();
    }

    private static void printNumberParity() {
        Scanner scr = new Scanner(System.in);
        if (scr.nextInt() % 2 == 0) {
            System.out.println("Введенное число является чётным");
        } else {
            System.out.println("Введенное число является нечетным");
        }
    }
}
