package pl.cschool.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Student implements Comparable<Student> {
    private String name;

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" + name +
                '}';
    }
}
