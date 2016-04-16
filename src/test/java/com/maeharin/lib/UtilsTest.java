package com.maeharin.lib;

import static org.junit.Assert.*;
import org.junit.Test;

public class UtilsTest {
    @Test
    public void testFoo() {
        assertEquals("foo", Utils.foo());
    }

    @Test
    public void testIsFoo() {
        assertTrue(Utils.isFoo());
    }
}
