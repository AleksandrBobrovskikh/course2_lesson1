package com.geekbrains;

public class Main {
    public static void main(String[] args) {

        Player [] players = {new Cat(), new Human(), new Robot()};
        Barier [] bariers = {new Wall(2), new Wall(6), new Road(120)};

        for (Player player : players) {
            for (Barier barier : bariers) {
                barier.passed(player);
            }
        }
        System.out.println();
        for (Player player : players) {
            if (player.getGame())
                System.out.println(player + "полностью прошел полосу препятствий!");
        }

    }
}
