package student_abstract;

public class StudentIT extends Student {
    protected float javaPoint, cssPoint;
    public StudentIT(String name, float javaPoint, float cssPoint) {
        super(name);
        this.javaPoint = javaPoint;
        this.cssPoint = cssPoint;
    }
    @Override
    float AvgPoint() {
        return (javaPoint*2 + cssPoint) / 3;
    }
    
}
