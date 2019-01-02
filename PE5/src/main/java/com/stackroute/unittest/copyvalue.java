package com.stackroute.unittest.pe1;

import java.util.HashMap;

public class copyvalue {

    public static HashMap<String, String> copyvalue1(HashMap<String,String>hs){
                     hs.put("val2",hs.get("val1"));
                     hs.put("val1","");
                     return hs;



    }
}
