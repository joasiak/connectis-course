package pl.cschool.taskset1;

public class PascalTriangle {

    public static int[][] generateTr(int rows) {
        int[][] arr = new int[rows][];
        arr[0] = new int[1];
        arr[0][0]=1;
        for (int i=1; i<rows; i++) {
            arr[i] = new int[i+1];
            arr[i][0]=1;
            arr[i][i]=1;

            for(int j=1; j<i; j++) {
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        return arr;
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

    public static int factorial(int n) {
        if (n==0) return 1;
        return n*factorial(n-1);
    }
}
