package com.stackroute.unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    private EvenNumTest evenNumObj;

    @Before
    public void setUp(){
        evenNumObj=new EvenNumTest();
    }

    @Test
    public void isEven1() {
        assertEquals(false,evenNumObj.isEven(0));
    }

    @Test
    public void isEven2() {
        assertEquals(false,evenNumObj.isEven(-1));
    }

    @Test
    public void isEven3() {
        assertEquals(true,evenNumObj.isEven(-2));
    }

    @Test
    public void isEven4() {
        assertEquals(false,evenNumObj.isEven(3));
    }
}