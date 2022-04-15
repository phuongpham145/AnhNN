package student_abstract;

public class StudentBiz extends Student {
    protected float accountant, marketing, sell;
    public StudentBiz(String name, float accountant, float marketing, float sell) {
        super(name);
        this.accountant = accountant;
        this.marketing = marketing;
        this.sell = sell;
    }
    @Override
    float AvgPoint() {
        return (accountant + marketing + sell) / 3;
    }

}
