package com.stackroute.unittest;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CounttimesTest {

    @Test
    public void count1() {

        ArrayList<String>pr=new ArrayList();


        assertArrayEquals(new String[]{"a:true","b:false","c:true","d:false"},Counttimes.count1(new String[]{"a","b","c","d","a","c","c"}).toArray());
    }
}