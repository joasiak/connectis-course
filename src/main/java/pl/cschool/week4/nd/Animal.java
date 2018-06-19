package pl.cschool.week4.nd;

public abstract class Animal implements Coder {

    String name;

    public abstract void move();

    @Override
    public void eat() {
        System.out.println("Has eaten...");
    }

    @Override
    public void repeat() {
        System.out.println("Tylko je i spi...");
    }
}
