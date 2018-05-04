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

    @Test
    public void pruebaPosicion(){
        MarsRover mr = new MarsRover(1,2,"N");
        assertEquals(1, mr.getX());
        assertEquals(2, mr.getY());
    }

    @Test
    public  void pruebaMovimiento(){
        MarsRover mr= new MarsRover(0,0,"N");
        mr.ponerMovimiento("ff");

        assertEquals(2,mr.getX());
        mr.ponerMovimiento("");
    }
}
