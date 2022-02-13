package Persons;

public abstract class Crew extends Person {
    protected Rank rank;
    public Crew(String name,Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public String announcement(String message){

        return message;
    }
}
