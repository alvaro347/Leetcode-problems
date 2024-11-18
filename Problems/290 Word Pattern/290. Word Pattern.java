class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");

        if (pattern.length() != split.length) {
          return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
          if (!map.get(pattern.charAt(i))) {
            map.add(pattern.charAt(i), split[i]);
          } else {
            if (map.get(pattern.charAt(i)) != split[i]) {
             return false;
            }
          }
          
        }
        for (int j = 0; j < pattern.length(); j++) {
          
        }
        return true;
    }
}
