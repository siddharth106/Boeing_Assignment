
import java.util.*;
public class Palindrome {
    public static boolean[]  isPalindrome(String s){

        boolean val[]=new boolean[2];
        if((checkpalindrome(s)==true)){
            val[1]=checksum(s);
             val[0]=true;

        }
        else
        {val[0]=false;
            val[1]=false;
        }
        return val;
    }
    public static boolean checkpalindrome(String s){
        int l = s.length();
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-1-i)){

                return false;
            }
        }
        return true;
    }
    public static boolean checksum(String s){
        int sum = 0;
        int num = 0;
        int l = s.length();
        for(int i=0;i<l;i++){
            num = Integer.parseInt(""+s.charAt(i));
            if(num%2==0)
                sum += num;
        }
        if(sum>=25)
           return(true);
        else
            return(false);


    }
}

