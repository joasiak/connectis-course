package pl.cschool.taskset2.figure;

public class Run {

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.setName("myCircle");
        myCircle.setRadius(5.9);
        System.out.println(myCircle.toString());

        Circle circleOne = new Circle(8.1);
        System.out.println(circleOne.toString());

        Cuboid myCuboid = new Cuboid();
        myCuboid.setName("myCuboid");
        myCuboid.setCubHeight(5);
        myCuboid.setCubWidth(2.2);
        myCuboid.setCubLength(3);
        System.out.println(myCuboid.toString());

        Cuboid cuboidOne = new Cuboid(3,4.3,5);
        System.out.println(cuboidOne.toString());

        Rectangle rectangleOne = new Rectangle();
        rectangleOne.setRecLength(4);
        rectangleOne.setRecWidth(7.6);
        System.out.println(rectangleOne.toString());

        Rectangle rectangleTwo = new Rectangle(2,5.5);
        System.out.println(rectangleTwo.toString());

        Sphere sphereOne = new Sphere();
        sphereOne.setRadius(7);
        System.out.println(sphereOne.toString());

        Sphere sphereTwo = new Sphere(4.8);
        System.out.println(sphereTwo.toString());

    }
}
