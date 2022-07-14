package adapter;

public class BlueMarker implements Marker{

    @Override
    public void mark(String text) {
        System.out.println("Blue marker write up : " + text);
    }
}
