package org.tonouchi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;

    @BeforeEach
    public void setUp() {
        app = new App();
    }

    @AfterEach
    public void tearDown() {
        app = null;
    }

    @Test
    public void testAdd() {
        assertEquals(2, app.add(1, 1));
    }

    @Test
    public void testAdd2() {
        assertEquals(3, app.add2(2, 1));
    }

    @Test
    public void testAdd3() {
        assertEquals(8, app.add3(3, 5));
    }

    @Test
    public void testAdd3_numm1MustBeSmallerThanNum2() {
        assertThrows(IllegalArgumentException.class, () -> app.add3(3, 2));
    }
}
