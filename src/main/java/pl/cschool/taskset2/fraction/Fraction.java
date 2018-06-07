package pl.cschool.taskset2.fraction;

public class Fraction {

    private int numerator;  //licznik
    private int denominator;  // mianownik

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int[] add(int num, int denom) {
        int[] result = new int[2];

        result[0]=this.numerator*denom + this.denominator*num;
        result[1]=this.denominator*denom;

        return result;
    }

    public int[] substract(int num, int denom) {
        int[] result = new int[2];

        result[0]=this.numerator*denom - this.denominator*num;
        result[1]=this.denominator*denom;

        return result;
    }

    public int[] multiply(int num, int denom) {
        int[] result = new int[2];

        result[0]=this.numerator*num;
        result[1]=this.denominator*denom;

        return result;
    }

    public int[] divide(int num, int denom) {
        int[] result = new int[2];

        result[0]=this.numerator*denom;
        result[1]=this.denominator*num;

        return result;
    }


    public int[] add(int[] f1, int[] f2) {
        int[] result = new int[2];

        result[0]=f1[0]*f2[1] + f1[1]*f2[0];
        result[1]=f1[1]*f2[1];

        return result;
    }

    public int[] substract(int[] f1, int[] f2) {
        int[] result = new int[2];

        result[1]=f1[0]*f2[1]-f1[1]*f2[0];
        result[2]=f1[1]*f2[1];

        return result;
    }

    public int[] multiply(int[] f1, int[] f2) {
        int[] result = new int[2];

        result[1]=f1[0]*f2[0];
        result[2]=f1[1]*f2[1];

        return result;
    }

    public int[] divide(int[] f1, int[] f2) {
        int[] result = new int[2];

        result[1]=f1[0]*f2[1];
        result[2]=f1[1]*f2[0];

        return result;
    }

}
