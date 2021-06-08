package org.tonouchi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @After
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

    @Test (expected = IllegalArgumentException.class)
    public void testAdd3_numm1MustBeSmallerThanNum2() {
        app.add3(3, 2);
        fail();
    }
}
