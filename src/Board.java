import processing.core.PApplet;

public class Board extends PApplet {
    int width;
    int row;

    public Board(int width, int row) {
        this.width = width;
        this.row = row;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }


}
