import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTenTest {

    @Test
    public void times() {

        ExerciseTen et=new ExerciseTen();
        assertEquals("srtttgjjjgjjjgjjjgjjj",et.times(new Object[]{4,"srtttgjjj"}));
    }
}