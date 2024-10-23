class Solution {
    public void rotate(int[] nums, int k) {

        if (nums == null || nums.length < 2) {
            return;
        }

        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    private void reverse(int[] nums, int i, int j) {
        int tmp = 0;
        while (i < j) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }

    // if (k == 0) {
    // return;
    // }
    // int counter = 0;
    // int p1 = 0;
    // int p2;
    // int numsSize = nums.length;
    // boolean even = numsSize % 2 == 0;
    // k = k > numsSize ? k % (numsSize) : k;
    // for (int i = 0; i < numsSize - 1; i++) {
    // if (p1 == k) {
    // p1 = 0;
    // }
    // p2 = k + i < numsSize ? k + i : k + i - numsSize;
    // // System.out.println("\np1 = " + p1 + ", p2 = " + p2 + ", i = " + i);
    // int temp = nums[p1];
    // nums[p1] = nums[p2];
    // nums[p2] = temp;
    // p1++;

    // if (p2 + i + 1 == numsSize - 1 && i == numsSize - 3) {
    // break;
    // }
    // }
    // }
}