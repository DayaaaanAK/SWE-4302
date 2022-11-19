package TripSolution;

public class Motor_Bike implements ITrip{
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;

    public Motor_Bike(int distanceKM,int timeMinutes,int numberOfPassengers)
    {
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    @Override
    public int perHeadFare() {
        int fare;
        fare = Math.max(25, distanceKM * 20) / numberOfPassengers;
        fare = fare - fare % 5;
        return fare;
    }

    @Override
    public boolean canTakeTrip() {
        if (numberOfPassengers < 1)
            return false;
        return numberOfPassengers <= 1 && distanceKM <= 10;
    }
}
