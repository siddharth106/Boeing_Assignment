package com.stackroute.unittest;
import org.junit.Test;

import static org.junit.Assert.*;
public class B5Test {



    public void check(){

        assertEquals(true,B5.eve(26));
        assertEquals(false,B5.eve(1));
        assertEquals(false,B5.eve(0));

        assertEquals(true,B5.eve(260002345454L));

    }
}
