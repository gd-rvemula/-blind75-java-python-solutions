package com.example.blind75.arrays;

public class ProductExceptSelf {
    //Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    //Solve it without division and in O(n) time with O(1) space complexity.
    //Example 1:
    //Input: nums = [1,2,3,4]
    //Output: [24,12,8,6]
    //Example 2:
    //Input: nums = [0,1,2,3,4]
    //Output: [0,0,0,0,0]
    //Constraints:
    //1 <= nums.length <= 10^4
    //0 <= nums[i] <= 10^5
    //Solution: O(n) time and O(n) space complexity.
    //We can use a for loop to iterate through the array and calculate the product of all the elements of the array except the current value.
    //We can use a second for loop to iterate through the array and calculate the product of all the elements of the array except the current value.
    //Time Complexity: O(n) - Linear time complexity.
    //Space Complexity: O(n) - Linear space complexity.
    //Hashmap: O(n) - Linear time complexity.
    //Hashmap: O(1) - Constant space complexity.
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }
        return result;
    }
}
