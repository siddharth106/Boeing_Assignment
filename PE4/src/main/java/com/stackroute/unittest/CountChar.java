package com.stackroute.unittest;



public class CountChar {

    public static int countchar(String s,char e){
           return s.length()-s.replaceAll(String.valueOf(e),"").length();

    }
}
