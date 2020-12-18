/**
 * BÄSTA STUDENT! Ändringar i den här klassen betyder automatiskt underkänt :)
 */

package com.assignment;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testa Hello-klassens instansiering och getter
 * Kör testet: gradle test --tests HelloTest
 */
class HelloTest {
    @Test
    public void getName() {

        /**
         *  Dynamisk version av: Hello h = new Hello("testname");
         *  Behövs för att testet skall kunna kompilera fast Hello-klassen inte existerar
         */
        Class h = null;
        try {
            h = (Class) Class.forName("Hello").getDeclaredConstructor().newInstance("testname");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals("testname", h.getName());
    }
}