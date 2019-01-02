package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountTest {

    @Test
    public void count1() {



        assertArrayEquals(new String[]{"one:5","two:2","three:2"},Count.count1("one one -one___two,,three,one @three*one?two"));
    }
}