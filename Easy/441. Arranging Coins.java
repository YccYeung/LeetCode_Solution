class Solution {
    public int arrangeCoins(int n) {
        int counter = 0;
        int twoSquare = 1;
        while (n >= twoSquare) {
            counter++;
            n -= twoSquare;
            twoSquare++;
        }

        return counter;
    }
}
