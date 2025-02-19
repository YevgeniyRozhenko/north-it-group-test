package cycles;

import java.util.Random;

public interface RandomlyFillable {
    static int[][] fillOutTwoDimensionalArray(int[][] array, int randomBoundValue) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(randomBoundValue);
            }
        }
        return array;
    }
}
