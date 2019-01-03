package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CopyValueTest {
  private CopyValue copy;
    @Before
    public void setUp() throws Exception {
           copy=new CopyValue();
    }

    @Test
    public void IsValueCopying() {
        HashMap<String,String>valueMap1=new HashMap();
        valueMap1.put("val1","java");
        valueMap1.put("val2","c++");
        HashMap<String,String>valueMap2=new HashMap();
        valueMap2.put("val1","");
        valueMap2.put("val2","java");

        assertEquals(valueMap2,copy.copyVal(valueMap1));

        valueMap1.clear();  valueMap2.clear();
        valueMap1.put("val1","python");
        valueMap1.put("val2","silicon");
        valueMap2.put("val1","");
        valueMap2.put("val2","python");

        assertEquals(valueMap2, copy.copyVal(valueMap1));
        valueMap1.clear(); valueMap2.clear();

        assertEquals(null, copy.copyVal(valueMap1));

        assertEquals(null, copy.copyVal(null));
    }



    @After
    public void tearDown() throws Exception {
    }
}