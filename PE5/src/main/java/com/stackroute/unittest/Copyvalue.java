package com.stackroute.unittest;

import java.util.HashMap;

public class Copyvalue {

    public static HashMap<String, String> copyVal(HashMap<String,String>hs){
                     hs.put("val2",hs.get("val1"));
                     hs.put("val1","");
                     return hs;



    }
}
