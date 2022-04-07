package com.geekbrains;

public class Human implements Player{
    int maxRun = 500;
    int maxJump = 7;
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
        return "Human ";
    }
}
