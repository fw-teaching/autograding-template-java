/**
 * BÄSTA STUDENT! Ändringar i den här klassen betyder automatiskt underkänt :)
 */

package com.assignment;

import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testar Hello-klassens instansiering och getter
 * Kör testet: gradle test --tests HelloTest
 */
class HelloTest {

    @Test
    public void getName() {

        String out = null;

        /**
         *  Dynamisk version av: Hello h = new Hello("testname");
         *  Behövs för att testet skall kunna kompilera fast Hello-klassen inte existerar
         *  (gradle kompilerar alla test fast man inte skulle köra alla)
         */
        try {
            Class<?> cls = Class.forName("com.assignment.Hello");
            Object obj = cls.getConstructor(String.class).newInstance("testname");
            out = cls.getDeclaredMethod("getName").invoke(obj).toString();

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        assertEquals("testname", out);

    }

}
