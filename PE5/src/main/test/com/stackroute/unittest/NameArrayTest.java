package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NameArrayTest {
  private  NameArray nameArray;
  private ArrayList<String> testArray;
    private ArrayList<String> resultantArray;
    @Before
    public void setUp() throws Exception {
        testArray=new ArrayList();
        nameArray=new NameArray();
        resultantArray=new ArrayList();
    }

    @Test
    public void isNameArrayEqual() {



        testArray.add("Apple");
        testArray.add("Grape");
        testArray.add("Molon");
        testArray.add("Berry");
        ArrayList<String> resultantArray=(ArrayList<String>) testArray.clone();
        resultantArray.set(2,"Mango");
        assertEquals(null,nameArray.replaceName(null,"",""));
        assertEquals(resultantArray,nameArray.replaceName(testArray,"Molon","Mango"));
        testArray.clear();
        assertEquals(null,nameArray.replaceName(testArray,"abc","def"));
    }

    @Test
    public void emptylist() {
        resultantArray.clear();
        assertEquals(resultantArray,nameArray.emptylist(testArray));
        assertEquals(null,nameArray.emptylist(null));
    }



    @After
    public void tearDown() throws Exception {
        nameArray=null;
        resultantArray=null;
        testArray=null;
    }
}