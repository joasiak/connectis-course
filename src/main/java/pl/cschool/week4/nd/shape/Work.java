package pl.cschool.week4.nd.shape;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Work {

    public static void main(String[] args) throws InterruptedException {

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        //  Date now = new Date();
        //  now.setSeconds(now.getSeconds() + 5);

     //   Thread.sleep(5000);
        TimeUnit.SECONDS.sleep(5);
        // TimeUnit.MINUTES.sleep(1);

        LocalDateTime time2 = LocalDateTime.now();
        System.out.println(time2);

        LocalDate t = LocalDate.now();
        System.out.println(t);
        Thread.sleep(5000);
        LocalDate t2 = LocalDate.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd-MM-uuuu" );
        LocalDate start = LocalDate.parse( "22-02-2010" , f );
        System.out.println(start);

      //  Duration duration = Duration.between(time, time2).getSeconds();

        System.out.println(Duration.between(time, time2).getSeconds());

        Period diff = Period.between(t, t2);

        LocalDate tt = LocalDate.parse("2007-12-03");
        System.out.println(tt);





        Shape[] shapes = new Shape[10];

        for (int i=0; i<shapes.length; i++) {
            switch (generateInt()) {
                case 0:
                    shapes[i] = new Rectangle();
                    break;
                case 1:
                    shapes[i] = new Square();
                    break;
                case 2:
                    shapes[i] = new Circle();
                    break;
                case 3:
                    shapes[i] = new Rectangle();
                    break;
            }
        }

        for (Shape s : shapes) {
            System.out.println(s.getArea());
        }
    }


    public static int generateInt() {
        Random rnd = new Random();
        return rnd.nextInt(4);
    }

}
