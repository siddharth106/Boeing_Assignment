package com.stackroute.unittest;

import java.util.HashMap;

public class CopyValue {

    public static HashMap<String, String> copyVal(HashMap<String,String>valueMap){
             if(valueMap==null||valueMap.isEmpty())
                 return null;

                     valueMap.put("val2",valueMap.get("val1"));
                     valueMap.put("val1","");
                     return valueMap;



    }
}
