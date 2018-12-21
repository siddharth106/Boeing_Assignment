package com.stackroute.unittest;

public class ReversePalindrome {



    public String reverse_string(String s){

        char rev[]=s.toCharArray();
        int k=s.length()-1;
        for(int i=0;i<s.length();i++){
            rev[k--]=s.charAt(i);
        }
        return String.copyValueOf(rev);
    }
}
