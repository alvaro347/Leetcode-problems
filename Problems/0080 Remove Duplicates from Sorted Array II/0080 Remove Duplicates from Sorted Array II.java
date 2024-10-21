class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k < 2 || nums[i] > nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }

        // boolean duplicate = false;

            // if (nums[i] == nums[i - 1]) {
            // if (duplicate == false) {
            // k++;
            // duplicate = true;
            // } else {
            // nums[i] = nums[k];
            // k++;
            // // duplicate =
            // }
            // } else {
            // nums[i] = nums[k];
            // k++;
            // duplicate = false;
            // }

            // if (duplicate) {
            //     if (nums[i] != nums[i - 1]) {
            //         nums[k] = nums[i];
            //         k++;
            //         duplicate = false;
            //     }

            // } else {
            //     if (nums[i] == nums[i - 1]) {
            //         k++;
            //         duplicate = true;
            //     } else {
            //         nums[k] = nums[i];
            //         k++;
            //     }
            // }
        }
        return k;
    }
}