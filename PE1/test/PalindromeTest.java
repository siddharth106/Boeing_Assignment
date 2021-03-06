import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void ispalindrome() {
        Palindrome p=new Palindrome();
        boolean a[]=new boolean[2];

        a[0]=false;
        a[1]=false;
        Assert.assertArrayEquals(a,p.isPalindrome("123"));
        a[0]=true;
        a[1]=false;
        Assert.assertArrayEquals(a,p.isPalindrome("121"));
        a[0]=true;
        a[1]=true;
        Assert.assertArrayEquals(a,p.isPalindrome("12345678987654321"));
        a[0]=true;
        a[1]=false;
        Assert.assertArrayEquals(a,p.isPalindrome("1331"));
        a[0]=false;
        a[1]=false;
        Assert.assertArrayEquals(a,p.isPalindrome("232323"));



    }
}