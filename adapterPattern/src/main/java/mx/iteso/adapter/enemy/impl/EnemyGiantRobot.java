package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyRobot;

public class EnemyGiantRobot implements EnemyRobot{

    public String smashWithHands() {
        String s = "Enemy Robot Causes Damage With Its Hands";
        System.out.println(s);
        return s;
    }

    public String walkForward() {
        String s = "Enemy Robot Walks Forward";
        System.out.println(s);
        return s;
    }

    public String reactToHuman(String driverName) {
        String s = "Enemy Robot Tramps on " + driverName;
        System.out.println(s);
        return s;
    }

}
