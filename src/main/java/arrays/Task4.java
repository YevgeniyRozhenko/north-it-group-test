package arrays;

/*
Дан массив с целыми числами. Вывести в консоль наибольшее из них
 */
public class Task4 {
    public static void main(String[] args) {
        printTheBiggestNum(new int[] {1, -19, 0, 99, -98});
    }

    private static void printTheBiggestNum(int[] nums) {
        int biggest = nums[0];
        for (int num : nums) {
            if (biggest < num) {
                biggest = num;
            }
        }
        System.out.println(biggest);
    }
}
