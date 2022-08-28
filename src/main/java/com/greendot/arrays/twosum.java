package com.greendot.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class twosum {

    // Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    // Example:
    // Given nums = [2, 7, 11, 15], target = 9,
    // Because nums[0] + nums[1] = 2 + 7 = 9,
    // return [0, 1].
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int complement = target - current;
            if (list.contains(complement)) {
                result[0] = i;
                result[1] = list.indexOf(complement);
                break;
            }
        }
        return result;
    }
}








