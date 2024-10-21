# 169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:

n == nums.length
1 <= n <= 5 \* 104
-109 <= nums[i] <= 109

## Notes

1. Initialize the possible predicted candidate for the answer to be 0, and mark its frequency or count as 0.
2. Iterate over the `nums` array
3. If `count == 0`, then set the candidate to the current num because as of now, this is the most occuring (appeared once which is more than 0 times).
4. If `num == candidate`, increase its count because it has already appeared.
5. If num is different than candidate, do `count --` → Why does this work? See explanation in step 6.
6. Repeat 3, 4, 5 → If `count` becomes 0, then update `candidate`, So the candidate is updated and the older one is no longer a good choice as a candidate.
7. The element stored in candidate is indeed our required answer!!
8. As it is guarrenteed that answer exists, so there is no need for further checking.
9. Return `candidate`.

WHY?

Because if the older one is the majority element then it would have not been cancelled by the other minor elements i.e. because we are doing count -- only when we don’t get the same element.
