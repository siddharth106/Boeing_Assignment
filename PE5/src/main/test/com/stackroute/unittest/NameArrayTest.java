package com.stackroute.unittest;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NameArrayTest {

    @Test
    public void namearray() {





        ArrayList<String> ar=new ArrayList();

        ar.add("Apple");
        ar.add("Grape");
        ar.add("Molon");
        ar.add("Berry");
        ArrayList<String> pr=(ArrayList<String>) ar.clone();
        pr.set(2,"Mango");
        assertArrayEquals(pr.toArray(),NameArray.namearray(ar,"Molon","Mango").toArray());
    }

    @Test
    public void emptylist() {
    }
}