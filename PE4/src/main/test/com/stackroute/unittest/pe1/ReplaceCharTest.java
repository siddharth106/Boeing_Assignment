package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {

    @Test
    public void replace() {
        assertEquals("abcfffttttftt",ReplaceChar.replace("abcddfllttdtl"));
        assertEquals("abcffteetfftttftt",ReplaceChar.replace("abcddleetddtlldtl"));
    }
}