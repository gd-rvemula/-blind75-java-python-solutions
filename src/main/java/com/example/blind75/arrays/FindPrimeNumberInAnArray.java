package com.example.blind75.arrays;

public class FindPrimeNumberInAnArray {

    //Given an integer array nums, return first prime number in the array.
    //If there is no prime number in the array, return -1.
    //Example 1:
    //Input: nums = [1,2,3,4,5,6,7,8]
    //Output: 7
    //Example 2:
    //Input: nums = [10,9,8,7,6,5,4,3,2,1]
    //Output: -1
    //Constraints:
    //1 <= nums.length <= 10^5
    //1 <= nums[i] <= 10^8
    //Solution: O(n) time and O(1) space complexity.
    //We can use a for loop to iterate through the array and check if the current value is prime.
    //If it is, we return the current value. If not, we continue to the next value.
    //Time Complexity: O(n) - Linear time complexity.
    //Space Complexity: O(1) - Constant space complexity.
    //Hashmap: O(n) - Linear time complexity.
    //Hashmap: O(1) - Constant space complexity.
    public static int findFirstPrimeNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
