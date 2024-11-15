import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");

        if (pattern.length() != split.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(split[i])) {
                    return false;
                } else {
                    map.put(pattern.charAt(i), split[i]);

                }
            } else {
                System.out.println("Value: " + map.get(pattern.charAt(i)) + " SplitS: " + split[i]);
                if (!map.get(pattern.charAt(i)).equals(split[i])) {
                    System.out.println(map.get(pattern.charAt(i)) + " " + split[i]);
                    return false;
                }
            }

        }
        return true;
    }
}
