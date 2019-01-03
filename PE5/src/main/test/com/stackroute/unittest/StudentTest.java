package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void asorder1() {

        ArrayList<Student> st1 = new ArrayList();
        ArrayList<Student> st2 = new ArrayList();
        Student st = new Student();
        st.setAge(12);
        st.setId(4);
        st.setName("rahul");
        st1.add(st);

        st = new Student();
        st.setAge(12);
        st.setId(13);
        st.setName("rahul");
        st1.add(st);
        st = new Student();
        st.setAge(12);
        st.setId(14);
        st.setName("rahul");
        st1.add(st);
        st = new Student();
        st.setAge(15);
        st.setId(15);
        st.setName("sunil");
        st1.add(st);
        st = new Student();
        st.setAge(12);
        st.setId(16);
        st.setName("keshav");
        st1.add(st);
        st = new Student();
        st.setAge(12);
        st.setId(17);
        st.setName("abhishek");
        st1.add(st);
     st1.sort(new StudentSorter());
        st = new Student();
        st.setAge(15);
        st.setId(15);
        st.setName("sunil");
        st2.add(st);
        st = new Student();
        st.setAge(12);
        st.setId(17);
        st.setName("abhishek");
        st2.add(st);
        st = new Student();
        st.setAge(12);
        st.setId(16);
        st.setName("keshav");
        st2.add(st);
        st = new Student();
        st.setAge(12);
        st.setId(4);
        st.setName("rahul");
        st2.add(st);
        st = new Student();
        st.setAge(12);
        st.setId(13);
        st.setName("rahul");
        st2.add(st);
        st = new Student();
        st.setAge(12);
        st.setId(14);
        st.setName("rahul");
        st2.add(st);


        Student st4[]=new Student[5];


        assertEquals((st1.toArray(st4)).toString(),(st2.toArray(st4)).toString());
    }




    @After
    public void tearDown() throws Exception {
    }
}