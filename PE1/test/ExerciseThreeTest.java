import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseThreeTest {

    @Test
    public void isVowl() {
ExerciseThree et=new ExerciseThree();

      assertEquals("cvcn",et.isVowl("sab1"));
        assertEquals("cvcv",et.isVowl("sabe"));
        assertEquals("nncv",et.isVowl("35be"));
    }
}