class Solution {
    public boolean canJump(int[] nums) {
        int numsLength = nums.length;
		int maxJump = 0;

        if (numsLength == 1 || numsLength == 0) {
            return true;
        }

        for (int i = 0; i < numsLength; i++) {
            if (maxJump < i) {
                return false;
            }
            if (maxJump >= numsLength - 1) {
				return true;
			}
            maxJump = Math.max(maxJump, nums[i] + i);
        }

        return true;
    }
}