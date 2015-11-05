package mx.iteso.adapter.enemy;

// This is the Adaptee. The Adapter sends method calls
// to objects that use the EnemyAttacker interface
// to the right methods defined in EnemyRobot

public interface EnemyRobot {

    public String smashWithHands();

    public String walkForward();

    public String reactToHuman(String driverName);

}
