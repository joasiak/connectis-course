package pl.cschool.week4;

public class Animal {

    String name;
    int size = 3;
    final long longsize = 15;


    public Animal() {
        System.out.println("Tworzę obiekt zwierzę");
    }

    public Animal(int size) {
        this.size = size;
        System.out.println("Tworzę obiekt zwierzę size");
    }

    public void move() {
        System.out.println("Zwierzak stoi w miejscu z klasy Animal");
    }

    public void move(int krok) {
        krok=3;
        System.out.println("Zwierzak się rusza o " + krok + " kroki");
    }

    public void move(long longstep){
        System.out.println("Zwierzak się rusza o " + longstep + " kroki");
    }

}
