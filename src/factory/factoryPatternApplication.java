package factory;

import java.util.Scanner;

public class factoryPatternApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vehicle you want");
        String vehicleName = scanner.next();
        Vehicle vehicle = Factory.getVehicle(vehicleName);
        vehicle.identify();
    }
}
