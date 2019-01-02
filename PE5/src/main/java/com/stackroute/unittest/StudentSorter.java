package com.stackroute.unittest.pe1;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
           if(o1.getAge()!=o2.getAge())
               return o2.getAge()-o1.getAge();
           else{
               if(!o1.getName().equals(o2.getName())){
                     return o1.getName().compareTo(o2.getName());
               }
               else{
                   return o1.getId()-o2.getId();
               }
           }
    }
}
