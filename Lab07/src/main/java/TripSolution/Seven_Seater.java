package TripSolution;

public class Seven_Seater implements ITrip{
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;

    public Seven_Seater(int distanceKM,int timeMinutes,int numberOfPassengers)
    {
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    @Override
    public int perHeadFare() {
        int fare;
        if (distanceKM < 10)
            fare = 300 / numberOfPassengers;
        else
            fare = distanceKM * 30 / numberOfPassengers;
        fare = fare - fare % 5;
        return fare;
    }

    @Override
    public boolean canTakeTrip() {
        if (numberOfPassengers < 1)
            return false;
        return numberOfPassengers <= 7 && distanceKM >= 10;
    }
}
