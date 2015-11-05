package mx.iteso.adapter.enemy.impl;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 04/11/2015.
 */
public class EnemyGiantTest {
    EnemyGiantRobot enemyGiantRobot;

    @Before
    public void setUp()
    {
        enemyGiantRobot = new EnemyGiantRobot();
    }

    @Test
    public void smashTest()
    {
        assertEquals(enemyGiantRobot.smashWithHands(), "Enemy Robot Causes Damage With Its Hands");
    }

    @Test
    public void walkTest()
    {
        assertEquals(enemyGiantRobot.walkForward(), "Enemy Robot Walks Forward");
    }

    @Test
    public void reactTest()
    {
        assertEquals(enemyGiantRobot.reactToHuman("Pedro"), "Enemy Robot Tramps on Pedro");
    }

}

