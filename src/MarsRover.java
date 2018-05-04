public class MarsRover {

    private String direction;
    private int x;
    private int y;

    public MarsRover(int x, int y, String direction) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public String getDirection() {
        return this.direction;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void ponerMovimiento(String cadena) {
        this.x=this.x+2;
        if (cadena.equals("l")){
            this.direction = "w";
        }
        else {
            this.direction = "e";
        }
    }
}
