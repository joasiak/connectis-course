package pl.cschool.week2;

public class WorkNd {

    public static int factorial(int n) {
        if (n==1) return 1;
        return n*factorial(n-1);
    }

    public static int fib(int n) {
        if (n==1) return 0;
        if (n==2) return 1;
        return fib(n-2)+fib(n-1);
    }


    public static int[][] generateTr2(int rows) {
        int[][] arr = new int[rows][];
        for (int i=0; i<rows; i++) {
            arr[i] = new int[i+1];
            for (int j=0; j<=i; j++) {
                arr[i][j]=Newton(i,j);
            }
        }
        return arr;
    }

    public static int Newton(int n, int k) {
        if (k==0) return 1;
        if(k==n) return 1;
        return Newton(n-1, k-1) + Newton(n-1,k);
    }



    public static void printTr(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for (int j=1; j<=arr.length-i; j++) {
                System.out.print("   ");
            }
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(fill(arr[i][j],6));
            }
            System.out.println();
        }
    }

    public static String fill(int number, int length) {
        String s = number+"";
        while (s.length() < length) s+=" ";
        return s;
    }

}
