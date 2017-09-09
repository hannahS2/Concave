public class Referee {
    private static User currentUser = new User(0);

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

        //가로 앞
        int preRow = 0;
        int currentX = posX-1;
        int currentY = posY;
        while(currentX>=0 && stones[currentX][currentY]==color){
            preRow++;
            currentX--;
        }
        //가로 뒤
        int postRow = 0;
        currentX=posX+1;
        currentY=posY;
        while(currentX<=0 && stones[currentX][currentY]==color){
            preRow++;
            currentX++;
        }
        if(preRow+postRow>=4){
            System.out.println(color+" 승리!");
            return true;
        }

        //새로 앞
        int preCol = 0;
        currentX = posX;
        currentY = posY-1;
        while(currentY>=0 && stones[currentX][currentY]==color){
            preRow++;
            currentY--;
        }
        //새로 뒤
        int postCol = 0;
        currentX=posX;
        currentY=posY+1;
        while(currentY<=0 && stones[currentX][currentY]==color){
            preRow++;
            currentY++;
        }
        if(preCol+postCol>=4){
            System.out.println(color+" 승리!");
            return true;
        }

        //대각선 좌상
        //대각선 우하






        return false;
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
