package pl.cschool.week4.nd;

public class Cat extends Animal {

    String name;

    @Override
    public void move() {
        System.out.println("Koteczek się rusza");
    }

    @Override
    public void sleep() {
        System.out.println("Spi...");
    }

}
