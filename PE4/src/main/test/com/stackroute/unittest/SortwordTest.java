package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortwordTest {

    @Test
    public void sort() {

        assertEquals(new String[]{"akash","rahul","sidh"},Sortword.sort(new String[]{"sidh","akash","rahul"}));
    }
}