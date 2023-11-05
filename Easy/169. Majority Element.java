import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (Integer num : nums) {
            if (!counter.containsKey(num)) {
                counter.put(num, 1);
            } else {
                counter.compute(num, (k, v) -> v + 1);
            }
        }
        int largest = 0;
        int returnValue = 0;
        for (Map.Entry<Integer, Integer> map : counter.entrySet()) {
            if (map.getValue() >= largest) {
                largest = map.getValue();
                returnValue = map.getKey();
            }
        }
        return returnValue;
    }
}
