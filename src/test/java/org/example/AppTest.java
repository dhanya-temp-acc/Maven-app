package org.example;

import  org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        Main app = new Main();
        assertEquals(5, app.add(2,3));
    }
}