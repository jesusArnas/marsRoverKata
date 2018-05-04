import org.junit.jupiter.api.Test;

import static javafx.scene.input.KeyCode.M;
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
    }

    @Test
    public void giraIzquierda(){
        MarsRover mr = new MarsRover(0,0,"N");
        mr.ponerMovimiento("l");
        assertEquals("w", mr.getDirection());
    }

    @Test
    public void girarDerecha(){
        MarsRover mr = new MarsRover(0,0,"N");
        mr.ponerMovimiento("r");
        assertEquals("e",mr.getDirection());

    }




}
