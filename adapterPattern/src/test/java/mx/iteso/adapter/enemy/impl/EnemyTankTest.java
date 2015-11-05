package mx.iteso.adapter.enemy.impl;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertSame;

/**
 * Created by Nacho on 04/11/2015.
 */
public class EnemyTankTest {
    EnemyTank enemyTank;

    @Before
    public void setUp()
    {
        enemyTank = new EnemyTank();
    }

    @Test
    public void fireWeaponTest()
    {
        assertEquals(enemyTank.fireWeapon(), "Enemy tank fires weapon");
    }

    @Test
    public void driveTest(){
        assertEquals(enemyTank.driveForward(),"Enemy Tank moves forward" );
    }

    @Test
    public void assignDriver()
    {
        assertEquals(enemyTank.assignDriver("Pedro"), "Pedro is driving the tank");
    }

}
