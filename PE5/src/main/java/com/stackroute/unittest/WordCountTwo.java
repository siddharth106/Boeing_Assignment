package com.stackroute.unittest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class WordCountTwo {
    public static ArrayList<String> total(String wordString[]){
        if(wordString==null||wordString.length==0)
            return null;
        HashMap<String,Integer>wordCountTable=new HashMap();



        ArrayList<String> wordArray=new ArrayList();
        for(String word:wordString){
            if(wordCountTable.containsKey(word))
                wordCountTable.put(word,wordCountTable.get(word)+1);
            else{
                wordCountTable.put(word,1);
                wordArray.add(word);
            }
        }
        ArrayList<String>wordCountArray=new ArrayList();

        for(String word:wordArray){
            if(wordCountTable.get(word)>=2){
            wordCountArray.add(word+":"+"true");
           // System.out.println(word+":"+"true");
                }
            else{
                wordCountArray.add(word+":"+"false");
                //System.out.println(word+":"+"false");
                   }
            }


        return wordCountArray;

    }
}
