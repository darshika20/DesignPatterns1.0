package builder;

import java.util.List;

public class Car {

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

    public Car(Engine engine, Fuel fuel, Steering steering, List<Seat> seats, AirBag airBag, CentralLock centralLock,
               MusicSystem musicSystem, SunRoof sunRoof) {
        this.engine = engine;
        this.fuel = fuel;
        this.steering = steering;
        this.seats = seats;
        this.airBag = airBag;
        this.centralLock = centralLock;
        this.musicSystem = musicSystem;
        this.sunRoof = sunRoof;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Steering getSteering() {
        return steering;
    }

    public void setSteering(Steering steering) {
        this.steering = steering;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public AirBag getAirBag() {
        return airBag;
    }

    public void setAirBag(AirBag airBag) {
        this.airBag = airBag;
    }

    public CentralLock getCentralLock() {
        return centralLock;
    }

    public void setCentralLock(CentralLock centralLock) {
        this.centralLock = centralLock;
    }

    public MusicSystem getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    public SunRoof getSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(SunRoof sunRoof) {
        this.sunRoof = sunRoof;
    }

    @Override
    public String toString() {
        return "Car{" +
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
