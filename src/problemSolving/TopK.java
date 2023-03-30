package problemSolving;

import java.util.*;
import java.util.stream.Collectors;

class TopK {
    static public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequency = new HashMap<>();
        int res[] = new int[k];
        for (int number : nums) {
            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.get(number) + 1);
            } else {
                frequency.put(number, 1);
            }

        }
        int i = 0;
        frequency = frequency.entrySet().stream().sorted((v1, v2) -> -v1.getValue().compareTo(v2.getValue())).limit(k).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        for (int val : frequency.keySet()) {
            res[i++] = val;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 1, 1, 2, 2, 3};
        int[] res = topKFrequent(numbers, 2);
        for (int value : res) {
            System.out.println(value);
        }


    }
}
