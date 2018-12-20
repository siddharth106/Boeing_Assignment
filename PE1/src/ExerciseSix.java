class ExcerciseSix {
    public static int typ(char c){

        if(c>='a'&&c<='z'){
            return 0;
        }
        else if(c>='A'&&c<='Z'){
            return 1;
        }
        else if(c>='1'&&c<='9'){
            return 2;
        }
        else{
            return 3;
        }
    }
}