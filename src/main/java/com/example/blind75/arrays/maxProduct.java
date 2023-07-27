package com.example.blind75.arrays;

public class maxProduct {
    //Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product
    //It is guaranteed that the answer will fit in a 32-bit integer.
    //A subarray is a contiguous subsequence of the array.
    //Example 1:
    //Input: nums = [2,3,-2,4]
    //Output: 6
    //Explanation: [2,3] has the largest product 6.
    //Example 2:
    //Input: nums = [-2,0,-1]
    //Output: 0

    //Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
    //Constraints:
    //1 <= nums.length <= 2 * 104
    //-10 <= nums[i] <= 10
    //The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    //Solution: O(n) time and O(1) space complexity.
    //We can use a for loop to iterate through the array and calculate the product of the current value and the previous value.
    //We can use a for loop to iterate through the array and calculate the product of the current value and the previous value.
    //Time Complexity: O(n) - Linear time complexity.
    //Space Complexity: O(1) - Constant space complexity.
    //Hashmap: O(n) - Linear time complexity.
    //Hashmap: O(1) - Constant space complexity.

    public static int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(temp * nums[i], min * nums[i]));
            result = Math.max(result, max);
        }
        return result;
    }
}
