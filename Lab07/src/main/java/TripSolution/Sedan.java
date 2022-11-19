package TripSolution;

public class Sedan implements ITrip{
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;

    public Sedan(int distanceKM,int timeMinutes,int numberOfPassengers)
    {
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    @Override
    public int perHeadFare() {
        int fare;
        fare = (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;
        fare = fare - (fare % 5);
        return fare;
    }

    @Override
    public boolean canTakeTrip() {
        if (numberOfPassengers < 1)
            return false;
        return numberOfPassengers <= 4 && distanceKM <= 25;
    }
}
