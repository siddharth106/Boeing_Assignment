package com.stackroute.unittest.pe1;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class copyvalueTest {

    @Test
    public void copyvalue1() {
        HashMap<String,String>hm1=new HashMap<>();
        hm1.put("val1","java");
        hm1.put("val2","c++");
        HashMap<String,String>hm2=new HashMap<>();
        hm2.put("val1","");
        hm2.put("val2","java");
        assertEquals(hm2,copyvalue.copyvalue1(hm1));
    }
}