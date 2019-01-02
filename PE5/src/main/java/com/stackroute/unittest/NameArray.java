package com.stackroute.unittest;

import java.util.*;

public class NameArray {
    public static ArrayList<String> nameArr(ArrayList<String>ar,String a,String b ){
        int i=0;
        for(String g:ar){
            if(g.equals(a))
                ar.set(i,b);
                i++;
        }

         return ar;
    }
    public static ArrayList<String> emptylist(ArrayList<String>ar){
          ar.clear();
        return ar;
    }

}
