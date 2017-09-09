public class Referee {
    static User currentUser = new User(0);

    static public User getCurrentUser() {
        return currentUser;
    }

    static public void setCurrentUser(User user) {
        currentUser = user;
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
            //막혀있는거 확인 (해야함)
            if(stones[posX-2][posY]==1){

            }
            return false;
        }
        //크로스 33
        if(stones[posX][posY]==stones[posX-1][posY-1]&&stones[posX][posY]==stones[posX-1][posY+1]&&stones[posX][posY]==stones[posX+1][posY-1]&&stones[posX][posY]==stones[posX+1][posY+1]){
            //막혀있는거 확인 (해야함)
            if(stones[posX-2][posY]==1){

            }
            return false;
        }
        return true;
    }

}
