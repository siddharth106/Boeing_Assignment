package com.stackroute.unittest;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeTest {

    private Grade gradeObj;
    private int[] marks={34,55,11,100};

    @Before
    public void setUp(){
        gradeObj=new Grade();
    }

    @Test
    public void checkMin(){
        assertEquals(11,gradeObj.findMin(marks));
    }

    @Test
    public void checkMax(){
        assertEquals(100,gradeObj.findMax(marks));
    }

    @Test
    public void checkAvg(){

        assertEquals(50,gradeObj.findAvg(marks));
    }

}