package factory;

public class Factory {

    public static Vehicle getVehicle(String vehicleName) {
        Vehicle vehicle = null;
        if ("Car".equalsIgnoreCase(vehicleName)) {
            vehicle = new Car();
        } else if ("Scooty".equalsIgnoreCase(vehicleName)){
            vehicle = new Scooty();
        } else if ("Cycle".equalsIgnoreCase(vehicleName)){
            vehicle = new Cycle();
        } else if ("Bike".equalsIgnoreCase(vehicleName)) {
            vehicle = new Bike();
        } else {
            System.out.println("Since the entered vehicle name does not exist, so creating default vehicle 'Bike'");
            vehicle = new Bike();
        }
        return vehicle;
    }
}
