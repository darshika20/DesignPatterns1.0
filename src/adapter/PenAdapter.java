package adapter;

public class PenAdapter implements Pen{

    private Marker marker;

    public PenAdapter(Marker marker) {
        this.marker = marker;
    }

    @Override
    public void write(String text) {
        marker.mark(text);
    }
}
