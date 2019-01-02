package com.stackroute.unittest;

import com.stackroute.unittest.Asorder;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsorderTest {

    @Test
    public void asorder1() {
        assertEquals(new String[]{"Alice","Bluto","Eugene","Harry","Olive"}, Asorder.asorder1(new String[]{"Harry","Olive","Alice","Bluto","Eugene"}));
    }
}