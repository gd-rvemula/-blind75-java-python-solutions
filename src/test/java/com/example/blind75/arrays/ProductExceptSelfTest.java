package com.example.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {
    @org.junit.jupiter.api.Test
    void productExceptSelf() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] result = ProductExceptSelf.productExceptSelf(nums);
        assertArrayEquals(new int[]{24, 12, 8, 6}, result);
    }

    @org.junit.jupiter.api.Test
    void productExceptSelf1() {
        int[] nums = new int[]{3, 5, 6, 10};
        int[] result = ProductExceptSelf.productExceptSelf(nums);
        assertArrayEquals(new int[]{300, 180, 150, 90}, result);
    }

}