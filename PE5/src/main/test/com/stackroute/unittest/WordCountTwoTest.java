package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WordCountTwoTest {
       private  WordCountTwo wordCount;
    @Before
    public void setUp() throws Exception {
        wordCount=new WordCountTwo();
    }

    @Test
    public void isCountEqual() {

        ArrayList<String>pr=new ArrayList();


        assertArrayEquals(new String[]{"a:true","b:false","c:true","d:false"}, wordCount.total(new String[]{"a","b","c","d","a","c","c"}).toArray());
        assertArrayEquals(new String[]{"a:true","c:false","d:false","e:false"}, wordCount.total(new String[]{"a","a","c","d","a","e","a"}).toArray());
        assertArrayEquals(new String[]{"a:false","b:true","d:true","e:false"}, wordCount.total(new String[]{"a","b","b","d","d","e","b"}).toArray());
        assertEquals(null,wordCount.total(null));
        assertEquals(null,wordCount.total(new String[]{}));
    }



    @After
    public void tearDown() throws Exception {
        wordCount=null;
    }
}