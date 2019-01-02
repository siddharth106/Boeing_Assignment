package com.stackroute.unittest;

public class Power4 {
    public boolean checkPowerOfFour(long a){
        if(a==1||a==0)
            return false;

        while(a!=1){


            if(a%4!=0)
                return false;
            a=a/4;
        }
        return true;

    }
}
