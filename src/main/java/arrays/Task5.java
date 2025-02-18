package arrays;

import java.util.*;

/*
Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если
таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести
соответствующее сообщение.
 */
public class Task5 {
    public static void main(String[] args) {
        printTheMostFrequentNum(new int[] {1, 0, 3, 1, 5, 0, 1, 3, 0, 3, 3, 3, 6, 6, 6, 6, 6});
    }

    private static void printTheMostFrequentNum(int[] nums) {
        Map<Integer, Integer> buff = new LinkedHashMap<>();
        for (int num : nums) {
            if (!buff.containsKey(num)) {
                buff.put(num, 1);
            } else {
                buff.put(num, buff.get(num) + 1);
            }
        }
        int key = buff.keySet().iterator().next();
        int value = buff.remove(key);
        int buffKey;
        int buffValue;
        for (Map.Entry<Integer, Integer> numWithFrequency : buff.entrySet()) {
            buffValue = numWithFrequency.getValue();
            if (buffValue > value) {
                value = buffValue;
                key = numWithFrequency.getKey();
            } else if (buffValue == value) {
                buffKey = numWithFrequency.getKey();
                if (key < buffKey) {
                    key = buffKey;
                }
            }
        }
        System.out.println("Наиболее часто встречающееся число: " + key);
    }
}
