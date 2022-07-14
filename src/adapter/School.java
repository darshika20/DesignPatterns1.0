package adapter;

public class School {

    public static void main(String[] args) {
        AssignmentWork assignmentWork = new AssignmentWork();
        Pen pen = new PilotPen();
        assignmentWork.writeAssignment(pen, "This is the first line of assignment");
        Marker marker = new BlueMarker();
        PenAdapter penAdapter = new PenAdapter(marker);
        assignmentWork.writeAssignment(penAdapter, "This is the second line of assignment");
    }
}
