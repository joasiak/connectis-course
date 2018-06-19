package pl.cschool.week4;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> emplys = new ArrayList<>();

    public Company(List<Employee> emplys) {
        this.emplys = emplys;
    }

    @Override
    public String toString() {
        return "Company{" +
                "emplys=" + emplys +
                '}';
    }
}
