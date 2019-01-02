package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsHenryTest {

    @Test
    public void ishenry() {
        assertEquals(true, IsHenry.checkishenry("name is Henry "));
        assertEquals(true, IsHenry.checkishenry("name is henry but not senorita"));
        assertEquals(false, IsHenry.checkishenry("name is hery"));
    }
}