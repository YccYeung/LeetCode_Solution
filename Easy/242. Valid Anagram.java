class Solution {
    public boolean isAnagram(String s, String t) {
        // convert both String to char for sorting
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        // sort both char array
        Arrays.sort(charS);
        Arrays.sort(charT);
        // convert char array back to String
        String newS = String.valueOf(charS);
        String newT = String.valueOf(charT);
        // compare the content of both String
        boolean toReturn = newS.equals(newT);
        return toReturn;
    }
}
