class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String number = String.valueOf(x);

        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i)!= number.charAt(number.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
