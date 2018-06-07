package pl.cschool.taskset1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PascalTriangleTest {

    @Test
    public void Test1() {

      //  printTr(PascalTriangle.generateTr(6));


        int[][] result = PascalTriangle.generateTr(5);
        int[][] expected = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1},{1,5,10,10,5,1}};

        for (int i=0; i<result.length; i++) {
            for (int j=0; j<result[i].length;j++) {
                assertEquals(expected[i][j], result[i][j]);
            }
        }
    }

}