package com.example.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {

    @org.junit.jupiter.api.Test
    void maxSubArray() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = MaxSubArray.maxSubArray(nums);
        assertEquals(6, result);
    }

    @org.junit.jupiter.api.Test
    void maxSubArrayFrom1Item() {
        int[] nums = new int[]{1};
        int result = MaxSubArray.maxSubArray(nums);
        assertEquals(1, result);
    }


    @org.junit.jupiter.api.Test
    void maxSubArrayIsFullArray() {
        int[] nums = new int[]{5, 4, -1, 7, 8};
        int result = MaxSubArray.maxSubArray(nums);
        assertEquals(23, result);
    }

}