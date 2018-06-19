package pl.cschool.week4;

public class Penguin extends Animal implements Coder  {

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
