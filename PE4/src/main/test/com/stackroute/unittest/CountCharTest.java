package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharTest {

    @Test
    public void countchar() {
        assertEquals(4, CountChar.countchar("aberrtrre",'r'));
        assertEquals(3, CountChar.countchar("effgtyjnffhyyt",'y'));
    }
}