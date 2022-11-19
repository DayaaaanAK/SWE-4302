package ISP.Problem2;

public class Car implements ICameraSwitches, IEngineSwitches, IRadioSwitches{
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

    @Override
    public boolean turnRadioOn() {
        return true;
    }

    @Override
    public boolean turnRadioOff() {
        return false;
    }
}
