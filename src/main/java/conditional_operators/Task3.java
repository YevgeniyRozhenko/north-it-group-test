package conditional_operators;

import java.util.Scanner;

/*
Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
сообщение, является ли треугольник равнобедренным, равносторонним или разносторонним.
 */
public class Task3 {
    public static void main(String[] args) {
        printTriangleType();
    }

    private static void printTriangleType() {
        Scanner scr = new Scanner(System.in);
        int aSide = scr.nextInt();
        int bSide = scr.nextInt();
        int cSide = scr.nextInt();
        if (aSide == bSide && aSide == cSide) {
            System.out.println("треугольник равносторонний");
        } else if (aSide == bSide && aSide != cSide
                || aSide == cSide && aSide != bSide) {
            System.out.println("треугольник равнобедренный");
        } else {
            System.out.println("треугольник разносторонний");
        }
    }
}
