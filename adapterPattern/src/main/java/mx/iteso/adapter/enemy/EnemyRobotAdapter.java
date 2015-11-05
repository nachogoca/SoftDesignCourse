package mx.iteso.adapter.enemy;

// The Adapter must provide an alternative action for
// the methods that need to be used because
// EnemyAttacker was implemented.

// This adapter does this by containing an object
// of the same type as the Adaptee (EnemyRobot)
// All calls to EnemyAttacker methods are sent
// instead to methods used by EnemyRobot

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot){
        theRobot = newRobot;
    }

    public String fireWeapon() {
        return theRobot.smashWithHands();
    }

    public String driveForward() {
        return theRobot.walkForward();
    }

    public String assignDriver(String driverName) {
        return theRobot.reactToHuman(driverName);
    }

}
