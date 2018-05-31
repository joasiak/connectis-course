package pl.cschool.week1;

import java.util.Random;
import static pl.cschool.week1.Histogram.*;
import static pl.cschool.week1.PascalTriangle.*;
import static pl.cschool.week1.TaskOth.*;
import static pl.cschool.week1.TasksString.*;


public class runner {
    public static void main(String[] args) {
       // int[] arr = generateArr(100, 30);
       // printMap(makeDistribution(arr));
      //  printArr(PascalTriangle.generateTr(15));
        int[][] arr = {
                {2,3,8,4},
                {3,9,5,2},
                {3,6,2,7}
        };

        System.out.println(halfStrToUpperCase("asdddsssd"));


    }


    static int[] generateArr(int listSize, int range) {
        Random rnd = new Random();
        int[] myList = new int[listSize];
        for (int i =0; i< listSize; i++) {
            myList[i]=rnd.nextInt(range);
        }
        return myList;
    }
}
