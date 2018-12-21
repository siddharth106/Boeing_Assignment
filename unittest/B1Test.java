package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class B1Test {


    @Test
    public void isPalin1() {

        assertArrayEquals(new Object[]{true,"dfd"},B1.isPalin("dfd"));
        assertArrayEquals(new Object[]{false,"abrte"},B1.isPalin("etrab"));

    }
}