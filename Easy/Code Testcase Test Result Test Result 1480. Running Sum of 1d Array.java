class Solution {
    public int[] runningSum(int[] nums) {
        // create total sum variable
        int sum = 0;
        // create int array for answer
        int[] toReturn = new int[nums.length]; 
        // get the sum from all int inside the array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            toReturn[i] = sum;
        }
        return toReturn;
    }
}
