import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1Test {

    @Test
    public void add() {

        Exercise1 exerObj=new Exercise1();
        assertEquals(7,exerObj.add());
    }
}