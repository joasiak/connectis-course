package pl.cschool.week2;

import org.junit.Assert;
import org.junit.Test;

import javax.tools.Tool;

import static org.junit.Assert.assertEquals;

public class ToolsTest {

    @Test
    public void test1() {

        //Given - dane wejściowe przygotowane na potrzeby testów
        int[][] tab = {{1, 2, 7, 2}, {2, 5, 3, 7, 2, 8}, {4, 7, 8, 8}};

        //when dane otrzymane z metody którą aktualnie testuję
        int[][] histogram = Tools.histogram(tab, 7);

        //then rezultat spodziewany, przygotowany dla danych testowych
        int[][] expectedResult = {{1, 2, 7, 5, 3, 8, 4}, {1, 4, 3, 1, 1, 3, 1}};

        for (int i = 0; i < histogram.length; i++) {
            for (int j = 0; j < histogram[i].length; j++) {
                assertEquals(expectedResult, histogram);
            }
        }
    }

    @Test
    public void test2() {

        //Given - dane wejściowe przygotowane na potrzeby testów
        int[][] tab = {{12, 18, 71, 22}, {71, 22, 37, 97, 32, 18}, {22, 37, 12, 18}};

        //when dane otrzymane z metody którą aktualnie testuję
        int[][] histogram = Tools.histogram(tab, 7);

        //then rezultat spodziewany, przygotowany dla danych testowych
        int[][] expectedResult = {{12, 18, 71, 22, 37, 97, 32}, {2, 3, 2, 3, 2, 1, 1}};

        for (int i = 0; i < histogram.length; i++) {
            for (int j = 0; j < histogram[i].length; j++) {
                assertEquals(expectedResult, histogram);
            }
        }
    }
}
