package observer;

public class SubjectFactory {

    public static Subject createSubjectInstance(String subjectName) {
        return new Channel(subjectName);
    }
}
