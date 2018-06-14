package pl.cschool.week3;

public class IronMan implements CanFly, CanBrain {

    @Override
    public void fly() {
        System.out.println("Super bohater poleciał");
    }

    @Override
    public void brain() {
        System.out.println("Super bohater myśli");
    }
}
