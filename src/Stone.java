public class Stone {

    public Stone(int color, int x, int y){

        this.color = color;
        this.x = x;
        this.y = y;

    }
    //돌맹이


    private int x;
    private int y;
    private int color; // 1 or 2

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
