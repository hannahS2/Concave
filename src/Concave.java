import processing.core.PApplet;

public class Concave extends PApplet {
    static int width = 600;
    static int row = 15;

    public static void main(String[] args){
        PApplet.main("Concave");
//        Board b = new Board(width, row);

    }

    @Override
    public void settings(){
        this.size(width + 20,width + 20);
    }

    @Override
    public void setup(){
        this.background(0);
    }

    @Override
    public void draw(){
        this.background(255);
        this.rect(10, 10, width, width);
        for(int i=0; i<15; i++) {
            this.line(10,10+i*(width/row), 610, 10+i*(width/row));
            this.line(10+i*(width/row), 10, 10+i*(width/row), 610);
        }
    }



}
