package abstractFactory;

public class AbstractFactory {

    public static CompanyVehicleFactory getVehicleFactory(String companyName) {
        if (Companies.TOYOTA.name().equalsIgnoreCase(companyName)) {
            return new ToyotaVehicleFactory();
        } else if (Companies.HONDA.name().equalsIgnoreCase(companyName)) {
            return new HondaVehicleFactory();
        } else {
            System.out.println("Sorry, we dont have vehicles of this company, please check out Toyota vehicles");
            return new ToyotaVehicleFactory();
        }
    }
}

