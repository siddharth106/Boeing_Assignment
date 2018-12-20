import java.util.*;

class ExerciseThree {
    public static String isVowl(String st){
       char ar[]=new char[st.length()];

        for(int i=0;i<st.length();i++){
            ar[i]=isAlphabetic(st.charAt(i));
        }
             return(String.copyValueOf(ar));

    }
    public static char isAlphabetic(char c) {
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return isVowel(c);
        else
            return 'n';
    }
    public static char isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            return 'v';
        else
            return 'c';

    }
}