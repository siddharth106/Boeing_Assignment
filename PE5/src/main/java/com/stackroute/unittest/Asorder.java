package com.stackroute.unittest;

import java.util.*;

public abstract class Asorder extends TreeSet<String> {


    public  static String[] asorder1(String st2[]){
        TreeSet<String>tr=new TreeSet(new Comparator<String>() {

            public int compare(String o1, String  o2) {
               return o1.compareTo(o2);
            }
        });

           for(String b:st2)
               tr.add(b);


return tr.toArray(st2);

    }
}
