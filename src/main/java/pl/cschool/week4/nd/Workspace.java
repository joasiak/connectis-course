package pl.cschool.week4.nd;

import pl.cschool.week4.nd.shape.Shape;

public class Workspace {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];


        Cat cat = new Cat();
        cat.move();
        cat.eat();

        Animal animal = new Cat();
        ((Cat) animal).sleep();

    }
}
