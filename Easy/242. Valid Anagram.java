class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        String newS = String.valueOf(charS);
        String newT = String.valueOf(charT);
        boolean toReturn = newS.equals(newT);
        return toReturn;
    }
}
