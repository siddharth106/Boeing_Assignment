package com.stackroute.unittest;

import java.util.ArrayList;
import java.util.*;

public class Count {

    public static String[] wordCount(String stringOfSentence){
               if(stringOfSentence==null)
                   return null;
                if(stringOfSentence.length()==0)
                    return null;
        Hashtable<String,Integer>wordTable=new Hashtable();
        if((String.valueOf(stringOfSentence.charAt(0))).matches("[^a-z]"))
       stringOfSentence= stringOfSentence.replaceFirst("[^a-z]","");
        if(stringOfSentence.length()==0)
            return null;
     //  System.out.println(stringOfSentence);
        String wordArray[]=stringOfSentence.split("[^a-z]+");
        ArrayList<String>arrayOfWord=new ArrayList();
        for(String k:wordArray){
            if(wordTable.containsKey(k))
                wordTable.put(k,wordTable.get(k)+1);
              else{
                wordTable.put(k,1);
              arrayOfWord.add(k);
              }
        }
        String wordWithCount[]=new String[wordTable.size()];
        int i=0;
         for(String k:arrayOfWord){

                    wordWithCount[i]=k+":"+wordTable.get(k);
                   // System.out.println(wordWithCount[i]);
                    i++;
         }
return wordWithCount;
    }
}
