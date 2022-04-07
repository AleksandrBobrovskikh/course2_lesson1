package com.geekbrains;

public class Road implements Barier{


    public int length;

    public Road(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void passed(Player player) {
        player.run(this);

    }

    @Override
    public String toString (){
        return " " + length + " м";
    }
}
