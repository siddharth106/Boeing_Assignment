package com.stackroute.unittest.pe1;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class counttimesTest {

    @Test
    public void count1() {

        ArrayList<String>pr=new ArrayList();


        assertArrayEquals(new String[]{"a:true","b:false","c:true","d:false"},counttimes.count1(new String[]{"a","b","c","d","a","c","c"}).toArray());
    }
}