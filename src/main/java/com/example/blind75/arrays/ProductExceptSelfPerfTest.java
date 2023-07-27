package com.example.blind75.arrays;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ProductExceptSelfPerfTest {
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
    public static int[] productExceptSelf_on2(int[] nums) {

        int[] result = new int[nums.length];
        Instant startTime = Instant.now();
        for (int n = 0; n < nums.length; n++) {
            result[n] = 1;
            for (int m = 0; m < nums.length; m++) {
                if (n != m) {
                    result[n] = result[n] * nums[m];
                }
            }

        }

        Instant endTime = Instant.now();
        long diffSeconds = ChronoUnit.MICROS.between(Instant.now(), startTime);
        System.out.println("time taken in micro seconds=" + diffSeconds);
        return result;
    }

    public static int[] productExceptSelf_O2n(int[] nums) {
        Instant startTime = Instant.now();
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


        long diffSeconds = ChronoUnit.MICROS.between(Instant.now(), startTime);
        System.out.println("time taken in micro seconds=" + diffSeconds);
        return result;

    }



    public static void main(String[] args) {
        //test with a small array
        int[] nums = {1, 2, 3, 4};
        productExceptSelf_on2(nums);
        productExceptSelf_O2n(nums);

        //test with a large array
        int[] nums2 = new int[100000];
        for (int j = 0; j < nums2.length; j++) {
            nums2[j] = 1;
        }
        productExceptSelf_on2(nums2);
        productExceptSelf_O2n(nums2);

    }
}
