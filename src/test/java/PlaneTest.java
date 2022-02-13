import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane1;
    Plane plane2;
    @Before
    public void before(){
        plane1 = new Plane(PlaneType.AIRBUS_A220);
        plane2 = new Plane(PlaneType.BOEING_747);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.AIRBUS_A220,plane1.getPlaneType());
    }
    @Test
    public void planeHasCapacity(){

        assertEquals(15,plane1.getPlaneType().getCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(400000,plane2.getPlaneType().getTotalWeight());
    }

}
