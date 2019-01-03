package com.stackroute.unittest;

import java.util.*;

public class NameArray {
    public static ArrayList<String> replaceName(ArrayList<String>nameArray,String original,String newOne){
        if(nameArray==null)
            return null;
        if(nameArray.isEmpty())
            return null;
        int index=0;
        for(String g:nameArray){
            if(g.equals(original))
                nameArray.set(index,newOne);
                index++;
        }

         return nameArray;
    }
    public static ArrayList<String> emptylist(ArrayList<String>nameArray){
        if(nameArray==null)
            return null;
          nameArray.clear();
        return nameArray;
    }

}
