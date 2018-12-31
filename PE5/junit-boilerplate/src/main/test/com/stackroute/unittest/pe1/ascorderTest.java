package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ascorderTest {

    @Test
    public void asorder1() {
        assertEquals(new String[]{"Alice","Bluto","Eugene","Harry","Olive"},ascorder.asorder1(new String[]{"Harry","Olive","Alice","Bluto","Eugene"}));
    }
}