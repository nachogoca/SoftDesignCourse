package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyAttacker;

public class EnemyTank implements EnemyAttacker {

    public String fireWeapon() {
        String s = "Enemy tank fires weapon";
        System.out.println(s);
        return s;
    }

    public String driveForward() {
        String s = "Enemy Tank moves forward";
        System.out.println(s);
        return s;
     }

    public String assignDriver(String driverName) {
        String s = driverName + " is driving the tank";
        System.out.println(s);
        return s;
    }

}
