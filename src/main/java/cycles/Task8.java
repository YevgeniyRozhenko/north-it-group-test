package cycles;

/*
Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и
вывести наибольшую из них
 */
public class Task8 implements RandomlyFillable {
    public static void main(String[] args) {
        int[][] nums = RandomlyFillable.fillOutTwoDimensionalArray(new int[5][5], 101);
        printTheBiggestSumOfArrayColumn(nums);
    }

    private static void printTheBiggestSumOfArrayColumn(int[][] nums) {
        int biggestSum = 0;
        for (int i = 0, sum; i < nums.length; i++) {
            sum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
            if (biggestSum < sum) {
                biggestSum = sum;
            }
        }
        System.out.println(biggestSum);
    }
}
