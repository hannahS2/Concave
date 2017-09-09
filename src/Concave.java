import processing.core.PApplet;
import processing.event.MouseEvent;

public class Concave extends PApplet {
    static int width = 600;
    static int row = 15;
    int margin = 40;
    int[][] stones = new int[16][16];

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

        for(int i=0; i<stones.length; i++) {
            for(int j=0; j<stones[i].length; j++) {
                int color = stones[i][j];
                int interval = width/row;

                if(color == 1) {
                    this.fill(255);
                    this.ellipse(i*interval+interval/2, j*interval+interval/2, 35, 35);
                }
                else if(color == 2) {
                    this.fill(0);
                    this.ellipse(i*interval, j*interval, 35, 35);
                }
                else continue;
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent event) {
        super.mouseClicked(event);

        int x = event.getX();
        int y = event.getY();

        User user1 = new User(1);
        int[] pos = user1.putStone(x, y, width, row, margin);



        System.out.println(stones);
    }
}
