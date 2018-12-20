import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseFourTest {

    @Test
    public void pattern() {
        ExerciseFour ef=new ExerciseFour();

        Assert.assertArrayEquals(new int[]{1,2,2,3,3,3},ef.pattern(3));
        Assert.assertArrayEquals(new int[]{1,2,2,3,3,3,4,4,4,4,5,5,5,5,5},ef.pattern(5));
    }
}