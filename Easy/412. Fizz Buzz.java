class Solution {
    public List<String> fizzBuzz(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";

        List<String> toReturn = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            
            if (i % 3 == 0 && i % 5 == 0) {
                toReturn.add(i-1,fizzBuzz);
            } 
            if (i % 3 == 0 && i % 5 != 0) {
                toReturn.add(i-1,fizz);
            } 
            if (i % 5 == 0 && i % 3 != 0) {
                toReturn.add(i-1,buzz);
            } 
            if (i % 3 != 0 && i % 5 != 0) {
                toReturn.add(i-1,Integer.toString(i));
            }
        }
        return toReturn;
    }
}
