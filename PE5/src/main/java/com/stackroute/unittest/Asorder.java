package com.stackroute.unittest;

import java.util.*;

public  class Asorder extends TreeSet<String> {


    public  static String[] ascendingOrder(String name[]){
        if(name==null||name.length==0)
            return null;
        TreeSet<String>nameTree=new TreeSet(new Comparator<String>() {

            public int compare(String o1, String  o2) {
               return o1.compareTo(o2);
            }
        });

           for(String nam:name)
               nameTree.add(nam);


return nameTree.toArray(name);

    }
}
