package com.stackroute.unittest.pe1;



public class CountChar {

    public static int countchar(String s,char e){
           return s.length()-s.replaceAll(String.valueOf(e),"").length();

    }
}
