package pl.cschool.week1;

import static pl.cschool.week1.Histogram.sortList;

public class TaskOth {

    //task0 -circle
    static double circlePerimeter(double r) {
        return 2*Math.PI*r;

    }
    //task0 -circle
    static double circleArea(double r) {
        return Math.PI*Math.pow(r,2);

    }
    //task0 -triangle
    static double triangleArea(double a, double b, double c) {
        double p =0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    //task0 -triangle
    static double cuboidArea(double a, double b, double H) {
        return 2*a*b+2*b*H + 2*a*H;
    }

    //task1  v=s/t [km/h]
    static double velocity(double s, double t) {
        return s/t;
    }

    //task2 [l/100km]
    static double fuelConsumption(double V, double s) {
        return (V/s)*100;
    }

    //task3 C/F
    static void cFConverter(double n) {
        double CtoF=1.8*n+32;
        double FtoC =(n-32)/1.8;
        System.out.println(n + " C to: " + CtoF + " F.");
        System.out.println(n + " F to: " + FtoC + " C.");
    }

    //task4 km/mile
    static void kmMileConverter(double n) {
        System.out.println(n + " km to: " + 0.621371*n + " mil.");
        System.out.println(n + " mil to: " + 1.609344*n + " km.");
    }

    //task5
    static int findNth(int[] arr, int k) {
        arr=sortList(arr);
        return arr[k];
    }

    //task6
    static void avgArr(int[][] arr) {
        double[] avgArrRow = new double[arr.length];
        for(int i=0; i< arr.length; i++) {
            int sum=0;
            for (int j=0; j<arr[i].length; j++) {
                sum+=arr[i][j];
            }
            avgArrRow[i] = (double) sum/arr[i].length;
        }

        System.out.print("Srednia wiersze: ");
        printArr(avgArrRow);
        System.out.println();

        double[] avgArrColl = new double[arr[0].length];
        for (int j=0; j<arr[0].length; j++) {
            int sum=0;
            for(int i=0; i< arr.length; i++) {
                sum+=arr[i][j];
            }
            avgArrColl[j] = (double) sum/arr.length;
        }

        System.out.print("Srednia kolumny: ");
        printArr(avgArrColl);
        System.out.println();

        int sum=0;
        for (int k=0; k<avgArrRow.length; k++) {
            sum+=avgArrRow[k];
        }
        System.out.println("Srednia całej tablicy: " + sum/avgArrRow.length);

    }

    public static void print2DimArr(double[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out. print(" ");
            }
            System.out.println();
        }
    }

    public static void printArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
