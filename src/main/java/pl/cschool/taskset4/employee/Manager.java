package pl.cschool.taskset4.employee;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Manager() {
        System.out.println("Tworzę obiekt klasy Manager");
    }

    @Override
    public double getSalary() {
        return bonus + super.getSalary();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
