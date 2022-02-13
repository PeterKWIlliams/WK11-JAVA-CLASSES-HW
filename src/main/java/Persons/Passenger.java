package Persons;

public class Passenger extends Person {
    private int noOfBags;

    public Passenger(String name, int noOfBags) {
        super(name);
        this.noOfBags = noOfBags;
    }

    public int getNoOfBags() {
        return noOfBags;
    }
    public void setNoBags(int value){
        this.noOfBags = value;
    }
    public void setNoOfBags(int noOfBags) {
        this.noOfBags = noOfBags;
    }


}
