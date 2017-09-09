import processing.core.PApplet;
import processing.event.MouseEvent;

public class Concave extends PApplet {
    static int width = 600;
    static int row = 15;
    int margin = 40;

    public static void main(String[] args){
        PApplet.main("Concave");


    }

    @Override
    public void settings(){
        this.size(width + margin,width + margin);
    }

    @Override
    public void setup(){
        this.background(0);
    }

    @Override
    public void draw(){
        this.background(248, 196, 126);
        for(int i=0; i<=15; i++) {
            this.line(margin/2,margin/2+i*(width/row), 600+margin/2, margin/2+i*(width/row));
            this.line(margin/2+i*(width/row), margin/2, margin/2+i*(width/row), 600+margin/2);
        }
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        super.mouseClicked(event);

        int x = event.getX();
        int y = event.getY();

        User user1 = new User(1);
        user1.putStone(x, y, width, row, margin);
    }
}
