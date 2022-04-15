package student_abstract;

public abstract class Student {
    protected String name;
    public Student(String name) {
        this.name = name;
    }
    abstract float AvgPoint();
}
