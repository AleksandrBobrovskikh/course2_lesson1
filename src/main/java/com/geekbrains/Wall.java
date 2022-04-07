package com.geekbrains;

public class Wall implements Barier{
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void passed(Player player) {
        player.jump(this);
    }

    @Override
    public String toString (){
        return " " + height + " м";
    }
}
