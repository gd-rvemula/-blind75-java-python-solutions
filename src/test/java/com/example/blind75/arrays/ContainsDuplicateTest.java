package com.example.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    @org.junit.jupiter.api.Test
    void containsDuplicate() {
        int[] nums = new int[]{1, 2, 3, 1};
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }
    @org.junit.jupiter.api.Test
    void containsDuplicateInUnsortedArray() {
        int[] nums = new int[]{4, 2, 3, 2};
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }
    @org.junit.jupiter.api.Test
    void doesNotContainsDuplicateInUnsortedArray() {
        int[] nums = new int[]{4, 2, 3, 1};
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertFalse(result);
    }

}