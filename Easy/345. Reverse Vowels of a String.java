class Solution {

    // set up vowels checklist
    char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public String reverseVowels(String s) {
        // set up String for answer
        String toReturn = "";
        // convert string to char array
        char[] charArray = s.toCharArray();
        // set up index array
        List<Integer> index = new ArrayList<>();

        // add index of vowel inside char array
        for (int i = 0; i < charArray.length; i++) {
            if (isVowel(charArray[i])) {
                index.add(i);
            }
        }

        // set up two pointers
        int x = 0;
        int y = index.size() - 1;

        while (x < y) {
            // perform element swap operation
            char temp = charArray[index.get(x)];
            charArray[index.get(x)] = charArray[index.get(y)];
            charArray[index.get(y)] = temp;
            // update two pointers value
            x++;
            y--;
        }
        // rebuild string from updated char array
        for (int i = 0; i < charArray.length; i++) {
            toReturn += charArray[i];
        }
        return toReturn;
    }
    // helper method
    public boolean isVowel(char s) {
        for (char c : vowels) {
            if (s == c) {
                return true;
            }
        }
        return false;
    }
}
