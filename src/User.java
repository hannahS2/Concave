public class User {

    public User(int color){
        this.color = color;
    }

    private int color; // 1 or 2

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean putStone(int x, int y, int width, int row, int margin){

        System.out.println(color+"색 돌을 "+ x +", "+ y + "에 놓는 중입니다.");

        //돌맹이 색 지정
        Stone stone = new Stone(this.color);

        //x,y 좌표지정
        float interval = width/row;
        int posX = x - margin/2 + (int)(interval/2);
        int posY = y - margin/2 + (int)(interval/2);
        posX = (int) (posX / interval);
        posY = (int) (posY / interval);
        stone.setX(posX);
        stone.setY(posY);
        System.out.println(color+"색 돌은 "+ posX +", "+ posY + "에 놓이는 중입니다.");

        //놓일 수 있는지 확인
        //1. 이미 놓여 있지는 않은지 확인

        //2. 33규칙을 위반하지 않았는지 확인


        return true;


    }
}
