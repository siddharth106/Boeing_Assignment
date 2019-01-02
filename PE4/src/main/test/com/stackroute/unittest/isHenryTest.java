package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class isHenryTest {

    @Test
    public void ishenry() {
        assertEquals(true, IsHenry.ishenry("name is Henry "));
        assertEquals(true, IsHenry.ishenry("name is henry but not senorita"));
        assertEquals(false, IsHenry.ishenry("name is hery"));
    }
}