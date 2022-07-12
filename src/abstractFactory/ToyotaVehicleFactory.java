package abstractFactory;

import factory.Vehicle;

public class ToyotaVehicleFactory extends CompanyVehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleName) {
        if (Vehicles.CAR.name().equalsIgnoreCase(vehicleName)) {
            return new ToyotaCar();
        } else if (Vehicles.BIKE.name().equalsIgnoreCase(vehicleName)) {
            return new ToyotaBike();
        } else {
            System.out.println("Sorry, we dont have this vehicle from this company, please check the multi-purpose " +
                    "Toyota Bike");
            return new ToyotaBike();
        }
    }
}
