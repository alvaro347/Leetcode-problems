class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> smallestSorted = new ArrayList<>();
        // int previous = nums[0];

        if (nums.length == 1) {
            smallestSorted.add(String.valueOf(nums[0]));
            return smallestSorted;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            while (i + 1 < nums.length && nums[i + 1] - nums[i] == 1) {
                i++;
            }

            if (num != nums[i]) {
                smallestSorted.add(num + "->" + nums[i]);
            } else {
                smallestSorted.add(String.valueOf(nums[i]));
            }

        }

        return smallestSorted;
    }
}