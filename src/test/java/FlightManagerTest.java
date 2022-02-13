import Flight.Flight;
import FlightManager.FlightManager;
import Persons.*;
import org.junit.Before;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;
import java.util.Collections;

public class FlightManagerTest {
    FlightManager flightManager;
    Passenger passenger1;
    Passenger passenger2;
    Flight flight;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrew cabinCrew1;
    ArrayList<Crew> crew;
    Plane plane;
    @Before
    public void before(){
        pilot1 = new Pilot("Jerry", Rank.FIRST_OFFICER);
        pilot2 = new Pilot("Rebecca", Rank.CAPTAIN);
        cabinCrew1 = new CabinCrew("Harris",Rank.FLIGHT_ATTENDANT);
        ArrayList<Crew> crew = new ArrayList<Crew>();
        Collections.addAll(crew,pilot1,pilot2,cabinCrew1);
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        plane = new Plane(PlaneType.BOEING_747);
        flight = new Flight(crew,passengers,plane,"SK247","LDN","LGW","17:50");
        flightManager =new FlightManager(flight);
    }


}
