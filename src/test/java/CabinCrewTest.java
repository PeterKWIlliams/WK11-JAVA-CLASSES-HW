import Persons.CabinCrew;
import Persons.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Kelly", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Kelly",cabinCrew.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT,cabinCrew.getRank());
    }

    @Test
    public void canAnnounce(){
        assertEquals("This is an announcement",cabinCrew.announcement("This is an announcement"));
    }
}
