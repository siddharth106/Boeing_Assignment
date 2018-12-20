import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseFiveTest {

    @Test
    public void sum() {

      ExerciseFive ef=new ExerciseFive();
        assertArrayEquals(new int[]{0,0},ef.sum(new Object[]{1,2,"d"}));
        assertArrayEquals(new int[]{1,9},ef.sum(new Object[]{1,2,6}));

}  }