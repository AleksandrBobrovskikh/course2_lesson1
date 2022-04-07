package com.geekbrains;

public class Robot implements Player{
    private int maxRun = 1000;
    private int maxJump = 10;
    private boolean game = true;


    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public boolean getGame() {
        return game;
    }

    @Override
    public void setGame(boolean b) {
    this.game = b;
    }

    @Override
    public String toString (){
        return "Robot ";
    }
}
