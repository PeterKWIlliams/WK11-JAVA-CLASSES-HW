import Flight.Flight;
import Persons.*;
import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class FlightTest {
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
    }

    @Test
    public void flightStartsWithNoPassengers(){
        assertEquals(0,flight.getNoOfPassengers());
    }
    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1,flight.getNoOfPassengers());
    }

    @Test
    public void hasCrew(){
        assertEquals(true,flight.hasEnoughCrew());
    }

   @Test
    public void canAddCrew(){
        flight.addCrew(pilot1);
        flight.addCrew(cabinCrew1);
        assertEquals(5,flight.getNoOfCrew());
   }
   @Test
    public void hasFlightNo(){
        assertEquals("SK247",flight.getFlightNo());
   }
    @Test
    public void hasDestination(){
        assertEquals("LDN",flight.getDestination());
    }
    @Test
    public void hasDepartureAirport(){
        assertEquals("LGW",flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("17:50",flight.getDepartureTime());
    }

}
