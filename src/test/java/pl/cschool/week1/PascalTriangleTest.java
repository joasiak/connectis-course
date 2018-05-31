package pl.cschool.week1;

import org.junit.Test;
import static pl.cschool.week1.PascalTriangle.*;

import static org.junit.Assert.*;

public class PascalTriangleTest {

    @Test
    public void Test1() {

        printTr(PascalTriangle.generateTr(10));

    }
}