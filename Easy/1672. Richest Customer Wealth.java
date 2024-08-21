class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int currWealth = 0;

         if (accounts.length == 1) {
            for (int i = 0; i < accounts[0].length; i++) {
                currWealth += accounts[0][i];
            }
            return currWealth;
        }

        for (int i = 0; i < accounts.length; i++) {
            if (currWealth > maxWealth) {
                maxWealth = currWealth;
            }
            currWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currWealth += accounts[i][j];
            }
        }
        return maxWealth;
    }
}
