package abstractFactory;

import factory.Vehicle;

public abstract class CompanyVehicleFactory {

    public abstract Vehicle getVehicle(String vehicleName);
}
