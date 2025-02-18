package cycles;

import java.util.Scanner;

/*
Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х
 */
public class Task2 {
    public static void main(String[] args) {
        getAllEvens();
    }

    private static void getAllEvens() {
        Scanner scr = new Scanner(System.in);
        int xNum = scr.nextInt();
        for (int i = 0; i <= xNum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
