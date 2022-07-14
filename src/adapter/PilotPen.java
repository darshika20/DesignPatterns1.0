package adapter;

public class PilotPen implements Pen{
    @Override
    public void write(String text) {
        System.out.println("Pilot pen write up : " + text);
    }
}
