import java.util.Scanner;

class ExerciseNine {
    public static String revv(String st){

        String rev = "";
        for(int i=0;i<st.length();i++){
            rev= rev + st.charAt(st.length()-1-i);
        }
        return rev;
    }
}