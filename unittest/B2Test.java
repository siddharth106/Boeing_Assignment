package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class B2Test {


    @Test
    public void isPow1() {

        assertEquals(true,B1.isPow(4));
        assertEquals(false,B1.isPow(1));
        assertEquals(true,B1.isPow(1423432344L));
        assertEquals(false,B1.isPow(99));


    }
}