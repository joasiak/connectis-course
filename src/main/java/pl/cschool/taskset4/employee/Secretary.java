package pl.cschool.taskset4.employee;

public class Secretary extends Employee {

    private int extraHours;
    private double salaryPerHour;

    public Secretary(String name, double salary) {
        super(name, salary);
    }

    public Secretary() {
        System.out.println("Tworzę obiekt klasy Secretary");
    }

    @Override
    public double getSalary() {
        return extraHours*salaryPerHour +super.getSalary();
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
