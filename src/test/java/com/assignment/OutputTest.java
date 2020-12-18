/**
 * BÄSTA STUDENT! Ändringar i den här klassen betyder automatiskt underkänt :)
 */

package com.assignment;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testa programmets output
 * Kör testet: gradle test --tests OutputTest
 */
public class OutputTest {
    @Test
    public void testOutputTest() {
        // Spara programmets normala output
        PrintStream originalOut = System.out;

        // Ta emot output som ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // Ersätt normal output med outputStream
        System.setOut(new PrintStream(outputStream));

        // Kör programmet
        Main.main(null);

        // Testa att programmets output har minst en viss längd
        assertTrue(outputStream.toString().length() > 5);

        // Återställ programmets normala output
        System.setOut(originalOut);
    }
}
