package mx.iteso.observer;

/**
 * Created by Nacho on 23/09/2015.
 */
public class Scorer {

    private String name;
    private int number;
    private String position;
    private String team;

    public Scorer(String name, int number, String position, String team)
    {
        setName(name);
        setNumber(number);
        setPosition(position);
        setTeam(team);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }
}
