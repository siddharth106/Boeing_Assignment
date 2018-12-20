import java.util.Scanner;

class ExerciseFour {
    public static int[] pattern(int n){

        Scanner in = new Scanner(System.in);

        int ar[]=new int[((n+1)*n)/2];
        int ind=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                ar[ind++]=i;
            }
        }   return ar;
    }
}

