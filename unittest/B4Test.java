package com.stackroute.unittest;
import org.junit.Test;

import static org.junit.Assert.*;
public class B4Test {



    public void check(){
        B4 b=new B4("Harry Potter",30,2500.3);
        assertEquals("Harry Potter 30 2500.3",b.toString());

    }
}
