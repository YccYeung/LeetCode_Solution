import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int arrayLength = 0;

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
            arrayLength++;
        }

        int setLength = 0;
        for (int i : set) {
            setLength++;
        }

        return arrayLength != setLength;
    }
}
