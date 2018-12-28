package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class COUNTCHARTest {

    @Test
    public void countchar() {
        assertEquals(4,COUNTCHAR.countchar("aberrtrre",'r'));
        assertEquals(3,COUNTCHAR.countchar("effgtyjnffhyyt",'y'));
    }
}