package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharTest {

    @Test
    public void countchar() {
        assertEquals(4, CountChar.numtimeschar("aberrtrre",'r'));
        assertEquals(3, CountChar.numtimeschar("effgtyjnffhyyt",'y'));
    }
}