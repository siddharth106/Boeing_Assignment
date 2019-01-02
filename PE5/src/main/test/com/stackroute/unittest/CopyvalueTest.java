package com.stackroute.unittest;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CopyvalueTest {

    @Test
    public void copyvalue1() {
        HashMap<String,String>hm1=new HashMap();
        hm1.put("val1","java");
        hm1.put("val2","c++");
        HashMap<String,String>hm2=new HashMap();
        hm2.put("val1","");
        hm2.put("val2","java");
        assertEquals(hm2,Copyvalue.copyVal(hm1));
    }
}