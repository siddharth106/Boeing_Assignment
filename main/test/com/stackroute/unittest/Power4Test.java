package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Power4Test {

    @Test
    public void checkPowerOfFourOne() {
        Power4 powerObj=new Power4();
        assertEquals(false,powerObj.checkPowerOfFour(0));
    }
    @Test
    public void checkPowerOfFourTwo() {
        Power4  powerObj=new   Power4 ();
        assertEquals(false,powerObj.checkPowerOfFour(3));
    }
    @Test
    public void checkPowerOfFourThree() {
        Power4  powerObj=new   Power4 ();
        assertEquals(true,powerObj.checkPowerOfFour(4));
    }
    @Test
    public void checkPowerOfFourFour() {
        Power4  powerObj=new   Power4 ();
        assertEquals(true,powerObj.checkPowerOfFour(64));
    }
    @Test
    public void checkPowerOfFourFive() {
        Power4  powerObj=new   Power4 ();
        assertEquals(false,powerObj.checkPowerOfFour(14));
    }
}