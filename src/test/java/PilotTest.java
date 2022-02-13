import Persons.Pilot;
import Persons.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Jerry", Rank.CAPTAIN);
    }

    @Test
    public void hasName(){
        assertEquals("Jerry",pilot.getName());
    }
    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN,pilot.getRank());
    }
    @Test
    public void canAnnounce(){
        assertEquals("This is an announcement",pilot.announcement("This is an announcement"));
    }

    @Test
    public void canFly(){
        assertEquals("Ready for takeoff",pilot.fly());
    }

}
