class Solution {
	public int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			if (nums[0] != val) {
				return 1;
			} else {
				return 0;
			}
		} else {
			int j = nums.length - 1;
			int k = 0;
			for (int i = 0; i <= j; i++) {
				while (nums[j] == val && i < j) {
					k++;
					j--;
				}
				if (nums[i] == val) {
					System.out.println("Value of i " + i + " Value of j " + j);
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					k++;
					j--;

				}

			}
			return nums.length - k;
		}

	}
}