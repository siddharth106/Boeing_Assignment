package com.stackroute.unittest.pe1;

import java.util.Collections.*;

public class COUNTCHAR {

    public static int countchar(String s,char e){
           return s.length()-s.replaceAll(String.valueOf(e),"").length();

    }
}
