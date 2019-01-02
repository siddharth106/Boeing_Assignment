package com.stackroute.unittest;

import java.util.ArrayList;
import java.util.*;

public class Count {

    public static String[] count1(String str){

        Hashtable<String,Integer>hm=new Hashtable();

        String st1[]=str.split("[^a-z]+");
        ArrayList<String>ar=new ArrayList();
        for(String k:st1){
            if(hm.containsKey(k))
                hm.put(k,hm.get(k)+1);
              else{
                hm.put(k,1);
              ar.add(k);
              }
        }
        String arr[]=new String[hm.size()];
        int i=0;
         for(String k:ar){
                    arr[i]=k+":"+hm.get(k);
                    System.out.println(arr[i]);
                    i++;
         }
return arr;
    }
}
