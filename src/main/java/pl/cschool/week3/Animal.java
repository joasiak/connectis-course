package pl.cschool.week3;

public class Animal implements Comparable<Animal> {

    Integer size;
    String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Animal p) {
        return this.size-p.size;
    }

    public String whoIsBigger(Animal a) {
        if (this.compareTo(a) < 0 ) return a.name;
        return this.name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
