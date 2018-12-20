import java.util.Scanner;

class ExerciseFive {
    public static int[] sum(Object ar[]){


           int val[]=new int[2];
         val[0]=1;  val[1]=0;
        int num = ar.length;
        int n = 0;
        int sum1 = 0;
        System.out.println("Enter your inputs : ");
        try{
            for(int i=0;i<num;i++){
                n = (int)ar[i];
                sum1 += n;
            }
            val[1]=sum1;
        }
        catch(Exception e){
            val[0]=0;
        }  return val;
    }
}