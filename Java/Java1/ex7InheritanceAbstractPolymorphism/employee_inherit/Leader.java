package employee_inherit;

public class Leader extends Employee {
    protected Double responsible;
    public Leader(String name, Double income, Double responsible) {
        super(name, income);
        this.responsible = responsible;
    }
    @Override
    public void Export(){
        System.out.println("Responsible : " + responsible);
    }
    @Override
    public Double IncomeCalculate(){
        return income + responsible;
    }
}
