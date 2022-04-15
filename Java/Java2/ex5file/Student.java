import java.io.Serializable;

public class Student implements Serializable {
    private String name, major;
    private float mark;

    public Student() {
    }

    public Student(String name, float mark, String major) {
        this.name = name;
        this.mark = mark;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        if (mark > 9)
            return "Exellent";
        return "Good";
    }
}
