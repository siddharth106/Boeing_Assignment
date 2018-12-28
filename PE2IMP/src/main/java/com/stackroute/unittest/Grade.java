package com.stackroute.unittest;

public class Grade {
    public int findMin(int ar[]){
        int k=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]<k)
                k=ar[i];
        }  return k;
    }
    public int findMax(int ar[]){
        int k=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>k)
                k=ar[i];
        }  return k;

    }
    public int findAvg(int ar[]){
             int sum=0;
             for(int i:ar)
                 sum+=i;
               sum/=ar.length;
              return sum;
    }
}
