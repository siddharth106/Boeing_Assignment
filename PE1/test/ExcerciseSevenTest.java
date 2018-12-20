import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExcerciseSevenTest {

    @Test
    public void sumfifteen() {
        ExcerciseSeven es=new ExcerciseSeven();
        Assert.assertArrayEquals(new int[]{6,5,4,3,2,1,1},es.sumfifteen("123456"));
        Assert.assertArrayEquals(new int[]{8,6,5,4,3,2,1,2},es.sumfifteen("1234568"));
    }
}