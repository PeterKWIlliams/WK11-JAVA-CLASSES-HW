package Flight;
import Persons.Crew;
import Persons.Passenger;
import Persons.Pilot;
import plane.Plane;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Crew> crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Crew> crew, ArrayList<Passenger> passengers, Plane plane, String flightNo, String destination, String departureAirport, String departureTime) {
        this.crew = crew;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public ArrayList<Crew> getCrew() {
        return crew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getNoOfPassengers() {
        return this.passengers.size();
    }

    public int getNoOfCrew() {
        return this.crew.size();
    }

    public boolean hasEnoughCrew() {
        if (getNoOfCrew() >= 3) {
            return true;
        }
        return false;

    }

    public void addCrew(Crew crew) {
        this.crew.add(crew);
    }
}
