import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (letters.containsKey(magazine.charAt(i))) {
                letters.put(magazine.charAt(i), letters.get(magazine.charAt(i)) + 1);
            } else {
                letters.put(magazine.charAt(i), 1);
            }
        }
        System.out.println(letters);
        for (int j = 0; j < ransomNote.length(); j++) {
            if (letters.containsKey(ransomNote.charAt(j))) {
                if (letters.get(ransomNote.charAt(j)) != 0) {
                    letters.put(ransomNote.charAt(j), letters.get(ransomNote.charAt(j)) - 1);
                    System.out.println(letters);
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
        return true;
    }
}