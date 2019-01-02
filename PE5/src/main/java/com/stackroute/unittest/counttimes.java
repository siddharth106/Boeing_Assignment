package com.stackroute.unittest.pe1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class counttimes {
    public static ArrayList<String> count1(String st1[]){
        HashMap<String,Integer>hm=new HashMap<>();



        ArrayList<String> ar=new ArrayList();
        for(String k:st1){
            if(hm.containsKey(k))
                hm.put(k,hm.get(k)+1);
            else{
                hm.put(k,1);
                ar.add(k);
            }
        }
        ArrayList<String>arr=new ArrayList<>();

        for(String k:ar){
            if(hm.get(k)>=2){
            arr.add(k+":"+"true");
            System.out.println(k+":"+"true");}
            else{
                arr.add(k+":"+"false");
                System.out.println(k+":"+"false");}
            }


        return arr;

    }
}
