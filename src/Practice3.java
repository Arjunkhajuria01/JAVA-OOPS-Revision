// Create a Ride class with private fields: rideId, pickupLocation, dropLocation, rideTime,
// seatsAvailable.
//Add getters and setters.
class Ride {
    private int rideId ;
    private String pickupLocation;
    private String dropLocation;
    private int rideTime;
    private int seatsAvailale;

    public void setRideId(int rideId){
        this.rideId = rideId;
    }

    public int getRideId(){
        return rideId;
    }

    public void setPickupLocation(String pickuplocation){
        this.pickupLocation = pickuplocation;
    }

    public String getPickupLocation(){
        return pickupLocation;
    }

    public void setDropLocation(String dropLocation){
        this.dropLocation = dropLocation;
    }

    public String getDropLocation(){
        return dropLocation;
    }

    public void setRideTime(int rideTime){
        this.rideTime = rideTime;
    }
    public int getRideTime(){
        return rideTime;
    }

    public void setSeatsAvailale(int seatsAvailale){
        this.seatsAvailale = seatsAvailale;
    }
    public int getSeatsAvailale(){
        return seatsAvailale;
    }

}
public class Practice3 {
    public static void main(String[] args) {
    Ride r1 = new Ride();
    r1.setRideId(1012);
        System.out.println(r1.getRideId());
    }
}
