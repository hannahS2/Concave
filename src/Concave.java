import processing.core.PApplet;

public class Concave extends PApplet {
    public static void main(String[] args){
        PApplet.main("Concave");
    }

    @Override
    public void settings(){
        this.size(300,300);
    }
    @Override
    public void setup(){
        this.background(0);
    }

    @Override
    public void draw(){
        this.background(255);
    }
}
