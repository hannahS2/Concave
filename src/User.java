public class User {



    public User(int color){
        this.color = color;
    }
    private int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean putSton(int x, int y, int width, int row, int margin){

        //돌맹이 색 지정
        Stone stone = new Stone(this.color);

        //x,y 좌표지정
        float interval = width/(row-1);
        int posX = x - margin + (int)(interval/2);
        int posY = y - margin + (int)(interval/2);
        posX = (int) (posX / interval);
        posY = (int) (posY / interval);
        stone.setX(posX);
        stone.setY(posY);

        //놓일 수 있는지 확인
        //1. 이미 놓여 있지는 않은지 확인

        //2. 33규칙을 위반하지 않았는지 확인


        return true;


    }
}
