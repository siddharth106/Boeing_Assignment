package com.stackroute.unittest.pe1;

public class WOrdOccurence {
    public static int occurence(String s,String seq){
        int count=0;
                     for(int i=0;i<=s.length()-seq.length();i++){

                         int p=0;  int typ=1;
                         for(int k=i;k<i+seq.length();k++){
                             if(s.charAt(k)!=seq.charAt(p))
                             {   typ=0;
                             break;
                             }  p++;
                         }
                         if(typ==1){
                             count++;       }
                     }
                        return count;
    }
}
