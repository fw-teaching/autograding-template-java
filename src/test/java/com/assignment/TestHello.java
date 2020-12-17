package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    public void getName() throws Exception {
        Hello h = new Hello("testname");
        assertEquals("testname", h.getName());
    }
}