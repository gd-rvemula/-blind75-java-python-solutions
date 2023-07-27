package com.greendot;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class ReadMultiByteFileTest {


    public void runComparision(String filename) {


        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource(filename).getFile());
        assertTrue(file.exists());
        ReadMultiByteFile readMultiByteFile = new ReadMultiByteFile();

        try (
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(file),
                                StandardCharsets.UTF_8))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String alteredLine = readMultiByteFile.processLine(line);

                assertEquals(line.length(), line.getBytes(StandardCharsets.UTF_8).length);
                assertEquals(line, alteredLine);

            }
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }

    @org.junit.jupiter.api.Test
    public void testSamplefile() {
        runComparision("SampleData1.txt");
    }
    @org.junit.jupiter.api.Test
    public void testSamplefile2() {
        runComparision("special-characters-comparison.txt");
    }
    @org.junit.jupiter.api.Test
    public void testSamplefil3() {
        runComparision("SpecialChars1.txt");
    }


}