package TripTest;
import TripProblem.Trip;
import TripProblem.VehicleType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmellyTripTest {
    @Test
    public void isTripValidSedan()
    {
        Trip sedan1 = new Trip(VehicleType.SEDAN,20,10,3);
        boolean isValid = sedan1.canTakeTrip();
        assertTrue(isValid);

        Trip sedan2 = new Trip(VehicleType.SEDAN,30,15,3);
        isValid = sedan2.canTakeTrip();
        assertFalse(isValid);

        Trip sedan3 = new Trip(VehicleType.SEDAN,20,10,5);
        isValid = sedan3.canTakeTrip();
        assertFalse(isValid);
    }

    @Test
    public void isTripValidSeven()
    {
        Trip sevenseater1 = new Trip(VehicleType.SEVEN_SEATER,11,5,6);
        boolean isValid = sevenseater1.canTakeTrip();
        assertTrue(isValid);

        Trip sevenseater2 = new Trip(VehicleType.SEVEN_SEATER,9,10,7);
        isValid = sevenseater2.canTakeTrip();
        assertFalse(isValid);

        Trip sevenseater3 = new Trip(VehicleType.SEVEN_SEATER,10,10,8);
        isValid = sevenseater3.canTakeTrip();
        assertFalse(isValid);
    }

    @Test
    public void isTripValidBike()
    {
        Trip bike1 = new Trip(VehicleType.MOTOR_BIKE,10,5,1);
        boolean isValid = bike1.canTakeTrip();
        assertTrue(isValid);

        Trip bike2 = new Trip(VehicleType.MOTOR_BIKE,11,5,1);
        isValid = bike2.canTakeTrip();
        assertFalse(isValid);

        Trip bike3 = new Trip(VehicleType.MOTOR_BIKE,9,5,2);
        isValid = bike3.canTakeTrip();
        assertFalse(isValid);
    }

    @Test
    public void getFare()
    {
        Trip sedan = new Trip(VehicleType.SEDAN,20,10,3);
        Trip sevenseater = new Trip(VehicleType.SEVEN_SEATER,11,5,6);
        Trip bike = new Trip(VehicleType.MOTOR_BIKE,10,5,1);

        assertEquals(220,sedan.perHeadFare());
        assertEquals(55,sevenseater.perHeadFare());
        assertEquals(200,bike.perHeadFare());
    }
}
