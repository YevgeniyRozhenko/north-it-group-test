package arrays;

/*
Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами
 */
public class Task2 {
    public static void main(String[] args) {
        printSumByEvenIndexes(new int[] {1, -2, 0, 100, -51});
    }

    private static void printSumByEvenIndexes(int[] nums) {
        int sum = 0;
        for (int i = 0, buff; i < nums.length; i++) {
            if (i % 2 == 0) {
                buff = nums[i];
                System.out.print(buff + " ");
                if (i < nums.length - 1) {
                    System.out.print("+ ");
                }
                sum += buff;
            }
        }
        System.out.print("= " + sum);
    }
}
