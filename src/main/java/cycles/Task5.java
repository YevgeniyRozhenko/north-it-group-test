package cycles;

import java.util.Scanner;

/*
Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка –
один символ)
 */
public class Task5 {
    public static void main(String[] args) {
        outputStringToChars();
    }

    private static void outputStringToChars() {
        Scanner scr = new Scanner(System.in);
        char[] inputString = scr.nextLine().toCharArray();
        for (char ch : inputString) {
            System.out.println(ch);
        }
    }
}
