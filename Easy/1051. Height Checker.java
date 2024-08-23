class Solution {
    public int heightChecker(int[] heights) {
        // create a shadow copy from original array
        int[] expected = heights.clone();
        // sort the array to be expected array
        Arrays.sort(expected);
        int mismatch = 0;
        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) {mismatch++;}
        }
        return mismatch;
    }
}
