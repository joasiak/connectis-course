package pl.cschool.taskset4.employee;

public class ExecutiveDirector extends Manager {

    private double extraBonus;

    public ExecutiveDirector(String name, double salary) {
        super(name, salary);
        extraBonus = 1.5*salary;
    }

    public ExecutiveDirector() {
        System.out.println("Tworzę obiekt klasy ExecutiveDirector");
    }

    @Override
    public double getSalary() {
        return extraBonus + super.getSalary();
    }
}
