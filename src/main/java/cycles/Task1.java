package cycles;

/*
Вывести в консоль таблицу умножения на 4
 */
public class Task1 {
    public static void main(String[] args) {
        multiply(4, 10);
    }

    private static void multiply(int mainFactor, int tableMaxFactor) {
        for (int i = 1; i <= tableMaxFactor; i++) {
            System.out.println(String.format("%s x %s = %s", i, mainFactor, i * 4));
        }
    }
}
