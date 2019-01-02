package com.stackroute.unittest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void asorder1() {
        Student re1[]=new Student[1];
        Student re2[]=new Student[1];
        ArrayList<Student> st1 = new ArrayList();
        ArrayList<Student> st2 = new ArrayList();
        Student st = new Student();
        st.setAge(12);
        st.setId(4);
        st.setName("rahul");
        st1.add(st);
        re1[0]=st;  re2[0]=st;
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



//        for(Student st5:st2){
//            System.out.println(st5.getAge()+" "+st5.getName()+" "+st5.getId());
//        }
//        for(Student st5:st1){
//            System.out.println(st5.getAge()+" "+st5.getName()+" "+st5.getId());
//        }
        ArrayList<Integer>ar7=new ArrayList();
        ar7.add(2);
        ar7.add(3);
        ArrayList<Integer>ar8=new ArrayList();
        ar8.add(5);
        ar8.add(3);
        Integer ar3[]={1,2,3,4};
        Integer ar4[]={1,2,3,4};
        assertEquals(re1,re2);
        Student re[]=new Student[2];

        //assertEquals(Arrays.toString(st1.toArray(st4)),Arrays.toString(st2.toArray(st4)));

        assertEquals(st1.toArray(st4),st2.toArray(st4));
    }


}