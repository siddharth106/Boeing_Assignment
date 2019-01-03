package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsorderTest {
  private   Asorder asc;
    @Before
    public void setUp() throws Exception {
        asc=new Asorder();
    }

    @Test
    public void isAscOrder() {
        assertEquals(new String[]{"Alice","Bluto","Eugene","Harry","Olive"}, asc.ascendingOrder(new String[]{"Harry","Olive","Alice","Bluto","Eugene"}));
        assertEquals(new String[]{"Abhishek","Carry","Cathi","Harry","Sammer"}, asc.ascendingOrder(new String[]{"Sammer","Cathi","Harry","Abhishek","Carry"}));
        assertEquals(new String[]{"Ankit","Bhavesh","Durgesh","Vipin"}, asc.ascendingOrder(new String[]{"Durgesh","Vipin","Bhavesh","Ankit"}));
        assertEquals(null,asc.ascendingOrder(new String[]{}));
        assertEquals(null,asc.ascendingOrder(null));
    }



    @After
    public void tearDown() throws Exception {
        asc=null;
    }
}