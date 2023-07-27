package com.example.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompareTwoFilesWithMatchingKeyTest {

        @org.junit.jupiter.api.Test
        void compare() {
            String file1 = "src/test/java/com/example/blind75/arrays/CompareTwoFilesWithMatchingKeyTest.java";
            String file2 = "src/main/java/com/example/blind75/arrays/DupKeyOption.java";
            String key = "package";
            String result = CompareTwoFilesWithMatchingKey.compare(file1, file2, key);
            assertEquals("package com.example.blind75.arrays;", result);
        }

        @org.junit.jupiter.api.Test
        void compare1() {
            String file1 = "src/test/java/com/example/blind75/arrays/FindPrimeNumberInAnArrayTest.java";
            String file2 = "src/test/java/com/example/blind75/arrays/MaxSubArrayTest.java";
            String key = "package";
            String result = CompareTwoFilesWithMatchingKey.compare(file1, file2, key);
            assertEquals("package com.example.blind75.arrays;", result);
        }

}