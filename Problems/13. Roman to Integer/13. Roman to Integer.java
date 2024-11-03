import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int romanToInt = 0;

        HashMap<String, Integer> map = new HashMap<>();

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int currentNumber = map.get(Character.toString(letter));
            if (i + 1 < s.length()) {
                int nextNumber = map.get(Character.toString(s.charAt(i + 1)));
                if (currentNumber < nextNumber) {
                    int nextSum = nextNumber - currentNumber;
                    romanToInt += nextSum;
                    i++;
                } else {
                    romanToInt += currentNumber;
                }
            } else {
                romanToInt += currentNumber;
            }

        }
        return romanToInt;
    }
}
