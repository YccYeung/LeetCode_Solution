class Solution {
    public void reverseString(char[] s) {
        int x = 0;
        int y = s.length - 1;

        for (int i = 0; i < s.length; i++) {
            if (x >= y) {break;}
            else {
                char temp;
                temp = s[x];
                s[x] = s[y];
                s[y] = temp;
                x++;
                y--;
            }
        }
    }
}
