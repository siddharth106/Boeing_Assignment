import java.util.Scanner;

class ExerciseTwo {
    public static String name(int n){

        if(n%2==0&&n>=20&&n<=30){
            return"Jerry";
        }
        if(n%2!=0&&n>=20&&n<=30){
            return"Tom";
        }
        return "T";
    }
}