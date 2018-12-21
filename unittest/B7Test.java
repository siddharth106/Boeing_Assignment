package com.stackroute.unittest;
import org.junit.Test;

import static org.junit.Assert.*;
public class B7Test {



    public void calc(){


        assertArrayEquals(720,B7.fac(6));
        assertArrayEquals(5040,B7.fac(7));
        assertArrayEquals("Bigger than Integer size",B7.fac(13));
    }
}