package pl.cschool.week4;

import java.sql.SQLOutput;

public class Cat extends Animal implements Coder {

    int sizeCat;

    public Cat(int size, int sizeCat) {
      //  super(size);
        this.sizeCat = sizeCat;
        System.out.println("Tworzę obiekt kot size");
    }

    public Cat() {
        System.out.println("Tworzę obiekt kot");
    }

    @Override
    public void move() {
        System.out.println("Kot się rusza z klasy Cat");
    }

    public void eat() {
        System.out.println("Kot je z klasy Cat");
    }

    @Override
    public void eat2() {
        System.out.println("Jemy...");
    }

    @Override
    public void sleep() {
        System.out.println("Spimy...");
    }

    @Override
    public void code() {
        System.out.println("Kodujemy...");
    }

    @Override
    public void repeat() {
        System.out.println("Powtarzamy...");
    }
}
