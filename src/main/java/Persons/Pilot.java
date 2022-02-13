package Persons;

public class Pilot extends Crew{

    public Pilot(String name,Rank rank) {
        super(name,rank);
    }

    public String fly() {
        return "Ready for takeoff";
    }
}
