import processing.core.PApplet;
import processing.event.MouseEvent;

import javax.jws.soap.SOAPBinding;

public class Concave extends PApplet {
    static int width = 600;
    static int row = 15;
    int margin = 40;
    int[][] stones = new int[16][16];
    static User user1 = new User(1);
    static User user2 = new User(2);

    public static void main(String[] args){
        PApplet.main("Concave");

        Referee.setCurrentUser(user1);
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
                    this.ellipse(i*interval+interval/2, j*interval+interval/2, 35, 35);
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


        int[] pos = Referee.getCurrentUser().putStone(x, y, width, row, margin);
        Stone newStone = new Stone(Referee.getCurrentUser().getColor(), pos[0], pos[1]);
        if(Referee.checkPossibility(stones, newStone) == false) {
            return;
        }

        if(Referee.getCurrentUser() == user1) {
            Referee.setCurrentUser(user2);
        } else if(Referee.getCurrentUser() == user2) {
            Referee.setCurrentUser(user1);
        }

        if(Referee.getCurrentUser().getColor() == 1) {
            stones[pos[0]][pos[1]]= 1;
        } else if(Referee.getCurrentUser().getColor() == 2) {
            stones[pos[0]][pos[1]]= 2;
        }

    }
}
