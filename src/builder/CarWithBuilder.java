package builder;

import java.util.List;

public class CarWithBuilder {

    //Required attributes
    private Engine engine;
    private Fuel fuel;
    private Steering steering;
    private List<Seat> seats;

    //Optional attributes
    private AirBag airBag;
    private CentralLock centralLock;
    private MusicSystem musicSystem;
    private SunRoof sunRoof;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        //Required attributes
        private Engine engine;
        private Fuel fuel;
        private Steering steering;
        private List<Seat> seats;

        //Optional attributes
        private AirBag airBag;
        private CentralLock centralLock;
        private MusicSystem musicSystem;
        private SunRoof sunRoof;

        public Builder builder() {
            return this;
        }

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder setFuel(Fuel fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder setSteering(Steering steering) {
            this.steering = steering;
            return this;
        }

        public Builder setSeats(List<Seat> seats) {
            this.seats = seats;
            return this;
        }

        public Builder setAirBag(AirBag airBag) {
            this.airBag = airBag;
            return this;
        }

        public Builder setCentralLock(CentralLock centralLock) {
            this.centralLock = centralLock;
            return this;
        }

        public Builder setMusicSystem(MusicSystem musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public Builder setSunRoof(SunRoof sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarWithBuilder build() throws RuntimeException{
            if (engine == null || steering == null || fuel == null || seats == null) {
                throw  new RuntimeException("Please pass all the required parts to build a car");
            } else {
                CarWithBuilder car = new CarWithBuilder();
                car.airBag = airBag;
                car.centralLock = centralLock;
                car.engine = engine;
                car.fuel = fuel;
                car.musicSystem = musicSystem;
                car.seats = seats;
                car.steering = steering;
                car.sunRoof = sunRoof;
                return car;
            }
        }
    }

    @Override
    public String toString() {
        return "CarWithBuilder{" +
                "engine=" + engine +
                ", fuel=" + fuel +
                ", steering=" + steering +
                ", seats=" + seats +
                ", airBag=" + airBag +
                ", centralLock=" + centralLock +
                ", musicSystem=" + musicSystem +
                ", sunRoof=" + sunRoof +
                '}';
    }
}
