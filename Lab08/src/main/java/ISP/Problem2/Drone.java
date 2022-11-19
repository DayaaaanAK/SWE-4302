package ISP.Problem2;

public class Drone implements ICameraSwitches, IEngineSwitches{
    @Override
    public boolean turnCameraOn() {
        return true;
    }

    @Override
    public boolean turnCameraOff() {
        return false;
    }

    @Override
    public boolean startEngine() {
        return true;
    }

    @Override
    public boolean turnoffEngine() {
        return false;
    }
}
