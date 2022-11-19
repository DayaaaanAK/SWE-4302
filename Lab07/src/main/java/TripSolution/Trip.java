package TripSolution;

public class Trip {
    private ITrip vehicletype;
    public Trip(VehicleType vehicleType,int distanceKM,int timeMinutes,int numberOfPassengers)
    {
        this.vehicletype = chooseVehicleType(vehicleType,distanceKM,timeMinutes,numberOfPassengers);
    }
    public int perHeadFare()
    {
        return vehicletype.perHeadFare();
    }
    public boolean canTakeTrip()
    {
        return vehicletype.canTakeTrip();
    }

    public ITrip chooseVehicleType(VehicleType vehicleType,int distanceKM,int timeMinutes,int numberOfPassengers)
    {
        ITrip vehicle = null;
        switch (vehicleType)
        {
            case SEDAN:
                vehicle = new Sedan(distanceKM,timeMinutes,numberOfPassengers);
                break;
            case MOTOR_BIKE:
                vehicle = new Motor_Bike(distanceKM,timeMinutes,numberOfPassengers);
                break;
            case SEVEN_SEATER:
                vehicle = new Seven_Seater(distanceKM,timeMinutes,numberOfPassengers);
                break;
        }
        return vehicle;
    }
}
