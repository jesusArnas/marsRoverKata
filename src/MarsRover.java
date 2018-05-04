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
}
