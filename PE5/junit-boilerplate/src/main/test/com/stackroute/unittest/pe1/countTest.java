package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class countTest {

    @Test
    public void count1() {



        assertArrayEquals(new String[]{"one:5","two:2","three:2"},count.count1("one one -one___two,,three,one @three*one?two"));
    }
}