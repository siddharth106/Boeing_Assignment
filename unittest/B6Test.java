
        package com.stackroute.unittest;
import org.junit.Test;

import static org.junit.Assert.*;
public class B6Test {



    public void calc(){
    B5 Student[]=new B5[7];
    Student[1]=new  B5(65);
        Student[2]=new  B5(65);
        Student[3]=new  B5(98);
        Student[4]=new  B5(69);
        Student[5]=new  B5(55);
        Student[6]=new  B5(76);
        Student[7]=new  B5(23);

       assertArrayEquals(new Object[]{23,98,64.33},B5.cal(student));
    }
}