package conditional_operators;

import java.util.Scanner;

/*
Пользователь вводит в консоли два числа, выводим сообщение “первое число
больше/меньше, чем второе” в зависимости от результата их сравнения
 */
public class Task2 {
    public static void main(String[] args) {
        printNumberComparing();
    }

    private static void printNumberComparing() {
        Scanner scr = new Scanner(System.in);
        int firstInputNum = scr.nextInt();
        int secondInputNum = scr.nextInt();
        String ratio = firstInputNum > secondInputNum? "больше" : "меньше";
        System.out.println(String.format("первое число %s, чем второе", ratio));
    }
}
