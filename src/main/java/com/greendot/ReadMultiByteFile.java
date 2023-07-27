package com.greendot;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadMultiByteFile {


    public static String processLine(String line) {

        int stringLenght = line.length();
        int byteLenght = getByteLenght(line);

        System.out.println("line length " + stringLenght);
        System.out.println("byte length " + byteLenght);
        
        if (stringLenght != byteLenght) {
            return alterLine(line, byteLenght);
        } else {
            return line;
        }
    }

    private static int getByteLenght(String line) {

        return line.getBytes(StandardCharsets.UTF_8).length;

    }

    private static String alterLine(String line, int byteLenght) {

        StringBuilder alteredLine = new StringBuilder(byteLenght);

        for (char c : line.toCharArray()) {
            byte[] charBytes = String.valueOf(c).getBytes(StandardCharsets.UTF_8);

            if (charBytes.length > 1) {
                System.out.println("character " + c);
                System.out.println(charBytes.length);
                int spaces = charBytes.length;

                for (int i = 0; i < spaces; i++) {
                    alteredLine.append(' ');
                }
                
            } else {
                alteredLine.append(c);
            }
        }

        return new String(alteredLine);
    }

}
