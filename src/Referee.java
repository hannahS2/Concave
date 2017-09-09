public class Referee {User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    static public boolean checkPossibility(int[][] stones, Stone newStone){
        //1. 이미 놓인 곳인지 확인
        if(!checkAlready(stones, newStone)){
            return false;
        }

        //2. 33인지 확인
        if(check33(stones, newStone)){
            return false;
        }
        return true;
    }

    static public boolean checkGameOver(int[][] stones, Stone newStone){
        int posX = newStone.getX();
        int posY = newStone.getY();
        int color = newStone.getColor();

        //가로판단 앞
        int x = posX;
        int y = posY;
        int numOfStone = 0;//fdsa
        while(x>=0 && color==stones[x][y]){

        }
        return true;
    }

    static private boolean checkAlready(int[][] stones, Stone newStone){
        int posX = newStone.getX();
        int posY = newStone.getY();

        if(stones[posX][posY]==0){
            return true;
        }else{
            return false;
        }
    }

    static private boolean check33(int[][] stones, Stone newStone){
        int posX = newStone.getX();
        int posY = newStone.getY();
        int color = stones[posX][posY];

        //십자가 33
        if(color==stones[posX-1][posY]&& color==stones[posX+1][posY]&& color==stones[posX][posY-1]&&color==stones[posX][posY+1]){
            if(stones[posX-2][posY]==1){

            }
            return false;
        }
        //크로스 33
        if(stones[posX][posY]==stones[posX-1][posY-1]&&stones[posX][posY]==stones[posX-1][posY+1]&&stones[posX][posY]==stones[posX+1][posY-1]&&stones[posX][posY]==stones[posX+1][posY+1]){
            return false;
        }
        return true;
    }

}
