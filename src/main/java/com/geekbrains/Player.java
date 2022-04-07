package com.geekbrains;

public interface Player extends Jumpable, Runable{

    int getMaxRun();
    int getMaxJump();
    boolean getGame();
    void setGame(boolean b);

    @Override
    default void jump(Wall wall){
        if (getGame()){
            if (this.getMaxJump() >= wall.getHeight()){
                System.out.println(this + "взял высоту" + wall);
            } else {
                System.out.println(this + "не взял высоту" + wall);
                setGame(false);
            }
        }
    }

    default void run(Road road){
        if (getGame()){
            if (this.getMaxRun() >= road.getLength()){
                System.out.println(this + "пробежал путь длиной" + road);
            } else {
                System.out.println(this + "не пробежал путь длиной" + road);
                setGame(false);
            }
        }
    }
}
