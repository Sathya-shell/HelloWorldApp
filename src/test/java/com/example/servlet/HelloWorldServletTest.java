package com.example.servlet;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldServletTest {
    @Test
    public void testHelloWorld() {
        String greeting = "Hello, World!";
        assertEquals("Hello, World!", greeting);
    }
}
