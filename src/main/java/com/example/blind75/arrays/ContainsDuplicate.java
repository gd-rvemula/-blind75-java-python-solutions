package com.example.blind75.arrays;

public class ContainsDuplicate {
    //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    //Example 1:
    //Input: nums = [1,2,3,1]
    //Output: true
    //Example 2:
    //Input: nums = [1,2,3,4]
    //Output: false
    //Example 3:
    //Input: nums = [1,1,1,3,3,4,3,2,4,2]
    //Output: true
    //Constraints:
    //2 <= nums.length <= 3 * 10^4
    //1 <= nums[i] <= 10^4
    //Solution: O(n) time and O(1) space complexity.
    //We can use a for loop to iterate through the array and check if the current value is in the hashmap.
    //If it is, we return true. If not, we add the current value to the hashmap.
    //Time Complexity: O(n) - Linear time complexity.
    //Space Complexity: O(1) - Constant space complexity.
    //Hashmap: O(n) - Linear time complexity.
    //Hashmap: O(1) - Constant space complexity.
    public static boolean containsDuplicate(int[] nums) {
        int previous = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < previous) {
                return true;
            } else {
                previous = nums[i];
            }
        }
        return false;
    }

}
