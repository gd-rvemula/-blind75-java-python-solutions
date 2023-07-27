package com.example.blind75.arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CompareTwoFilesWithMatchingKey {
    // Compare two files with matching key
    // Given two files, find the matching key and print the values from both files


    public static Map<String, String> byBufferedReader(String filePath, DupKeyOption dupKeyOption) {
        Map<String, String> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    if (dupKeyOption == DupKeyOption.OVERWRITE) {
                        map.put(key, value);
                    } else if (dupKeyOption == DupKeyOption.KEEP_FIRST) {
                        map.putIfAbsent(key, value);
                    } else if (dupKeyOption == DupKeyOption.KEEP_LAST) {
                        map.put(key, value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;


    }

    public static String compare(String file1, String file2, String key) {
        return byBufferedReader(file1, DupKeyOption.KEEP_FIRST).get(key) + " " + byBufferedReader(file2, DupKeyOption.KEEP_FIRST).get(key);
    }
}
