package com.stackroute.unittest.pe1;

import java.util.Arrays;

public class Revword {

    public static String sort(String a){

        String r[]=a.split(" ");

        int k=0; char c;
        for(String s:r) {
          char b[]=s.toCharArray();
          for(int i=0;i<b.length/2;i++){
              c=b[b.length-i-1];
              b[b.length-i-1]=b[i];
              b[i]=c;
          }
             r[k++]=String.valueOf(b);
        }
          return String.join(" ",r);
    }
}
