package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class isHenryTest {

    @Test
    public void ishenry() {
        assertEquals(true,isHenry.ishenry("name is Henry "));
        assertEquals(true,isHenry.ishenry("name is henry but not senorita"));
        assertEquals(false,isHenry.ishenry("name is hery"));
    }
}