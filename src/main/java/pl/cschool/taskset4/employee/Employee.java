package pl.cschool.taskset4.employee;

import java.util.Date;

public class Employee extends Person {


    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee() {
        System.out.println("Tworzę obiekt klasy Employee");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
