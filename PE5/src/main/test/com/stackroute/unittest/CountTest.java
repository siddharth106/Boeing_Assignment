package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountTest {

  private  Count count;
    @Before
    public void setUp() throws Exception {
        count=new Count();
    }

    @Test
    public void isCountEqual() {

assertArrayEquals(new String[]{"one:5","two:2","three:2"},count.wordCount("one one -one___two,,three,one @three*one?two"));
        assertArrayEquals(new String[]{"three:3","two:3","seven:1"},count.wordCount("three__two--two?two,,seven__three,@three"));
        assertArrayEquals(new String[]{"one:3","two:1","three:2"},count.wordCount("-one one -two?__one,,three,@three"));
        assertArrayEquals(null,count.wordCount(""));
        assertArrayEquals(null,count.wordCount(null));
    }


    @After
    public void tearDown() throws Exception {

        count=null;
    }
}