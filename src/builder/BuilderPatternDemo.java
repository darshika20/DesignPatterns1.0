package builder;

import java.util.ArrayList;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        Car carWithNoBuilder = new Car(new Engine(), Fuel.DIESEL, new Steering(), new ArrayList<>(), new AirBag(),
                new CentralLock(), new MusicSystem(), new SunRoof());
        System.out.println("For building car with no builder , we had to assign all parameters in constructor which " +
                "makes design messy");
        System.out.println(carWithNoBuilder);

        CarWithBuilder carWithBuilder = CarWithBuilder.builder().setEngine(new Engine()).setFuel(Fuel.DIESEL)
                .setCentralLock(new CentralLock()).setSteering(new Steering()).setSeats(new ArrayList<>()).build();
        System.out.println("After providing all necessary parts to build car :" + carWithBuilder);

        carWithBuilder = CarWithBuilder.builder().setAirBag(new AirBag())
                .setCentralLock(new CentralLock()).setMusicSystem(new MusicSystem()).setEngine(new Engine()).build();
        System.out.println("After applying builder pattern, object creation is now clean and maintainable ");
        System.out.println(carWithBuilder);

    }
}
