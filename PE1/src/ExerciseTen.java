import java.util.Scanner;

public class ExerciseTen {
    public static String times(Object[] ar){


        int num = (int)ar[0];


        String st = (String)ar[1];

        String res = st;
        for(int i=1;i<num;i++){
            res+=st.substring(st.length()-num);
        }
       return res;
    }
}