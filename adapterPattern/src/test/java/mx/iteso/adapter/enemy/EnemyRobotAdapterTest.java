package mx.iteso.adapter.enemy;

import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import mx.iteso.adapter.enemy.impl.EnemyTank;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nacho on 04/11/2015.
 */
public class EnemyRobotAdapterTest {
    private EnemyRobotAdapter enemyRobotAdapter;
    private EnemyRobot enemyRobot;
    @Before
    public void setUp()
    {
        enemyRobot = new EnemyGiantRobot();
        enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);
    }

    @Test
    public void fireTest()
    {
        assertEquals(enemyRobotAdapter.fireWeapon(), enemyRobot.smashWithHands());
    }

    @Test
    public void driveTest()
    {
        assertEquals(enemyRobotAdapter.driveForward(), enemyRobot.walkForward());
    }

    @Test
    public void driverTest()
    {
        assertEquals(enemyRobotAdapter.assignDriver("Pedro"), enemyRobot.reactToHuman("Pedro"));
    }
}
