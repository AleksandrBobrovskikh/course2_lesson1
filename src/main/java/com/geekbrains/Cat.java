package com.geekbrains;

public class Cat implements Player{

    int maxRun = 100;
    int maxJump = 5;
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
        return "Cat ";
    }
}
