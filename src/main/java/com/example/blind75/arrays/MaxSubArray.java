package com.example.blind75.arrays;

public class MaxSubArray {

    //Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    //Example 1:
    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: [4,-1,2,1] has the largest sum = 6.
    //Example 2:
    //Input: nums = [1]
    //Output: 1
    //Example 3:
    //Input: nums = [5,4,-1,7,8]
    //Output: 23
    //Constraints:
    //1 <= nums.length <= 3 * 104
    //-105 <= nums[i] <= 105
    //Solution: O(n) time and O(1) space complexity.
    //We can use a for loop to iterate through the array and calculate the sum of the current value and the previous value.
    //We can use a for loop to iterate through the array and calculate the sum of the current value and the previous value.
    //Time Complexity: O(n) - Linear time complexity.
    //Space Complexity: O(1) - Constant space complexity.
    //Hashmap: O(n) - Linear time complexity.
    //Hashmap: O(1) - Constant space complexity.
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
