package abstractFactory;

import factory.Vehicle;

public class HondaVehicleFactory extends CompanyVehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleName) {
        if (Vehicles.CAR.name().equalsIgnoreCase(vehicleName)) {
            return new HondaCar();
        } else if (Vehicles.BIKE.name().equalsIgnoreCase(vehicleName)) {
            return new HondaBike();
        } else {
            System.out.println("Sorry, we dont have this vehicle from this company, please check the multi-purpose Honda Bike");
            return new HondaBike();
        }
    }
}
