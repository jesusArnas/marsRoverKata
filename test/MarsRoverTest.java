import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    @Test
    public void roverInitialization()
    {
        MarsRover mr = new MarsRover(1,2,"N");
        assertNotNull(mr);
    }

    @Test
    public void knownIsDirection() {
        MarsRover mr = new MarsRover(1,2,"N");
        assertEquals("N", mr.getDirection());
        mr = new MarsRover(1,2,"S");
        assertEquals("S", mr.getDirection());
    }
}
