import java.util.Arrays;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = 0;

        if (nums == null) {
            return count;
        }

        // Arrays.sort(nums);
        // int sum = 0;
        //
        // while (sum < target) {
        //     sum += nums[nums.length - 1 - count];
        //     count++;
        // }

        for (int i = 0; i < nums.length; i++) {
            int j = 1;
            int sum = nums[i];

            while(i + j < nums.length && sum < target) {
                sum += nums[i + j];
                j++; 
            }
            count = Math.min(count, j);
        }

        return count;

    }
}