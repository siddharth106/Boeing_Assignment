import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseNineTest {

    @Test
    public void revv() {
        ExerciseNine en=new ExerciseNine();
        assertEquals("fedcba",en.revv("abcdef"));
        assertEquals("dhfddcba",en.revv("abcddfhd"));
        assertEquals("a",en.revv("a"));
    }
}