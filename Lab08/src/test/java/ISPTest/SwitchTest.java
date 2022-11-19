package ISPTest;

import ISP.Problem2.Car;
import ISP.Problem2.Drone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwitchTest {
    @Test
    public void CarEngineTest()
    {
        Car car = new Car();
        assertTrue(car.startEngine());
        assertFalse(car.turnoffEngine());
    }

    @Test
    public void CarRadioTest()
    {
        Car car = new Car();
        assertTrue(car.turnRadioOn());
        assertFalse(car.turnRadioOff());
    }

    @Test
    public void CarCameraTest()
    {
        Car car = new Car();
        assertTrue(car.turnCameraOn());
        assertFalse(car.turnCameraOff());
    }

    @Test
    public void DroneEngineTest()
    {
        Drone drone = new Drone();
        assertTrue(drone.startEngine());
        assertFalse(drone.turnoffEngine());
    }

    @Test
    public void DroneCameraTest()
    {
        Drone drone = new Drone();
        assertTrue(drone.turnCameraOn());
        assertFalse(drone.turnCameraOff());
    }
}
