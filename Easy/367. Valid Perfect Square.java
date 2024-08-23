class Solution {
    public boolean isPerfectSquare(int num) {
        int product = 0;
        if (num == 1) {return true;}
        for (int i = 1; i <= num / 2; i++) {
            product = i * i;
            if (product > num) {return false;}
            if (product == num) {return true;}
        }
        return false;
    }
}
