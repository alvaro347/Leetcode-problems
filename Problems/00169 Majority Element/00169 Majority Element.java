import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        // Basic solution for striaght apporach
        // since conditions are that the num will appear more than n/2
        Arrays.sort(nums);
        return nums[nums.length / 2]; 
        
        // To solve it using Boyer-Moore's Majority Voting:
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            } 
            if (num == candidate) {
                count ++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}