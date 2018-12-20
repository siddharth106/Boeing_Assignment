import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTwoTest {

    @Test
    public void name() {
       ExerciseTwo et=new ExerciseTwo();
        assertEquals("Jerry",et.name(24));
        assertEquals("Tom",et.name(23));
        assertEquals("Jerry",et.name(22));
        assertEquals("T",et.name(31));
        assertEquals("T",et.name(12));
    }
    }
