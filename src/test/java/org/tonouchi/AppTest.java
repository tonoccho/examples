package org.tonouchi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
}
