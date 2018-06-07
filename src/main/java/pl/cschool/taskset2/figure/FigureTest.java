package pl.cschool.taskset2.figure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FigureTest {

    Circle circle = new Circle(7);
    Cuboid cuboid = new Cuboid(3,2,5);
    Rectangle rectangle = new Rectangle(4,9);
    Sphere sphere = new Sphere(4);

    @Test
    public void circleTest() {
        assertEquals(43.96, circle.circlePerimeter(),2);
        assertEquals(153.86, circle.circleArea(),2);

    }

    @Test
    public void cuboidTest() {
        assertEquals(62.0,cuboid.cuboidArea(),2);
        assertEquals(30,cuboid.cuboidVolume(),2);
    }

    @Test
    public void rectangleTest() {
        assertEquals(36,rectangle.rectArea(),2);
        assertEquals(26,rectangle.rectPerimeter(),2);
    }


    @Test
    public void sphereTest() {
        assertEquals(200.96,sphere.sphereArea(),2);
        assertEquals(267.94,sphere.sphereVolume(),2);
    }

}
