package conditional_operators;

import java.util.Scanner;

/*
Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
“Число больше десяти”, если меньше – “Число меньше десяти”
 */
public class Task1 {
    public static void main(String[] args) {
        printNumberComparingWithTen();
    }

    private static void printNumberComparingWithTen() {
        Scanner scr = new Scanner(System.in);
        int inputNumber = scr.nextInt();
        if (inputNumber > 10) {
            System.out.println("Число больше десяти");
        } else if (inputNumber < 10) {
            System.out.println("Число меньше десяти");
        }
    }
}
