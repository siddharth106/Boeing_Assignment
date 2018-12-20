import java.util.*;
class ExcerciseSeven {
    public static int[] sumfifteen(String a){



        int[] sorted =new int[a.length()+1];
        int sum=0;
        int in=0;
        for(int p:a.toCharArray()){
            sorted[in++]=p-48;
        }
        int temp;
        Arrays.sort(sorted);
        for(int i=0;i<sorted.length/2;i++){
            temp=sorted[i];
            sorted[i]=sorted[sorted.length-1-i];
            sorted[sorted.length-1-i]=temp;
        }


        for(int i:sorted)
        {
            if(i%2==0){
                sum+=i;   }     }

        if(sum>=15)
           sorted[a.length()]=2;
        else
            sorted[a.length()]=1;
        return sorted;
    }



}