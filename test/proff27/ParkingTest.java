package proff27;

import org.junit.Before;
import org.junit.Test;
import proff27.hw2.park.Car;
import proff27.hw2.park.ParkFullException;
import proff27.hw2.park.Parking;

import static org.junit.Assert.assertEquals;

public class ParkingTest {

    private Parking module = new Parking();

    @Before
    public void setUp() {
        module = new Parking();
    }

    @Test
    public void testParkSucess() throws ParkFullException {
        Parking parking = module;
        boolean actualRes = parking.park(new Car("AA5555AA", "Audi", "Black")) > 0;
        boolean expectedRes = true;
        assertEquals(actualRes, expectedRes);
    }

    @Test(expected = ParkFullException.class)
    public void testParkFailure() throws ParkFullException {
        Parking parking = module;
        for (int i = 0; i < 9; i++) {
            parking.park(new Car("AA5555AA", "Audi", "Black"));
        }
        parking.park(new Car("AA5555AA", "Audi", "Black"));
    }

    @Test
    public void testLeaveSucess() throws IndexOutOfBoundsException, ParkFullException {
        Parking parking = module;
        Car car = new Car("AA5555AA", "Audi", "Black");
        int parkPlace = parking.park(car);
        boolean expectedRes = true;
        boolean actualRes = parking.leave(parkPlace).equals(car);
        assertEquals(actualRes, expectedRes);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testLeaveFailure() throws IndexOutOfBoundsException, ParkFullException {
        Parking parking = module;
        Car car = new Car("AA5555AA", "Audi", "Black");
        parking.park(car);
        parking.leave(5);
    }
}
