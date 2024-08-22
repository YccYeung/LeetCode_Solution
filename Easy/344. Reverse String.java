class Solution {
    public void reverseString(char[] s) {
        // set up two pointers
        int x = 0;
        int y = s.length - 1;

        for (int i = 0; i < s.length; i++) {
            if (x >= y) {break;}
            else {
                // perform a swap operation
                char temp;
                temp = s[x];
                s[x] = s[y];
                s[y] = temp;
                // update two pointers
                x++;
                y--;
            }
        }
    }
}
