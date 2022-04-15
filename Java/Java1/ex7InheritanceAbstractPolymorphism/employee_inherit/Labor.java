package employee_inherit;

public class Labor extends Employee {
    protected Double hourly;
    protected int workTime;
    public Labor(String name, Double income, Double hourly, int workTime) {
        super(name, income);
        this.hourly = hourly;
        this.workTime = workTime;
    }
    @Override
    public Double IncomeCalculate() {
        return hourly *workTime;
    }
    
}
