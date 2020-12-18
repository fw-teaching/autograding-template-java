/**
 * BÄSTA STUDENT! Ändringar i den här klassen betyder automatiskt underkänt :)
 */

package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testa Hello-klassens instansiering och getter
 * Kör testet: gradle test --tests HelloTest
 */
class HelloTest {
    @Test
    public void getName() {
        Hello h = new Hello("testname");
        assertEquals("testname", h.getName());
    }
}