import org.junit.Test;

import static org.junit.Assert.*;

public class ExcerciseSixTest {

    @Test
    public void typ() {
       ExcerciseSix es=new ExcerciseSix();
        assertEquals(0,es.typ('a'));
        assertEquals(1,es.typ('X'));
        assertEquals(2,es.typ('4'));
        assertEquals(3,es.typ('!'));
    }
}