package pl.cschool.taskset2.fraction;

public class Fraction {

    private int numerator;  //licznik
    private int denominator;  // mianownik

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
    }

    public Fraction add(Fraction fraction) {
        return Fraction.add(this, fraction);
    }

    public Fraction substract(Fraction fraction) {
        return Fraction.substract(this, fraction);
    }

    public Fraction multiply(Fraction fraction) {
        return Fraction.multiply(this, fraction);
    }

    public Fraction divide(Fraction fraction) {
        return Fraction.divide(this, fraction);
    }


    public static Fraction add(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        result.setNumerator(f1.getNumerator()*f2.getDenominator() + f1.getDenominator()*f2.getNumerator());
        result.setDenominator(f1.getDenominator()*f2.getDenominator());
        return result;
    }

    public static Fraction substract(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        result.setNumerator(f1.getNumerator()*f2.getDenominator()-f1.getDenominator()*f2.getNumerator());
        result.setDenominator(f1.getDenominator()*f2.getDenominator());
        return result;
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        result.setNumerator(f1.getNumerator()*f2.getNumerator());
        result.setDenominator(f1.getDenominator()*f2.getDenominator());
        return result;
    }

    public static Fraction divide(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        result.setNumerator(f1.getNumerator()*f2.getDenominator());
        result.setDenominator(f1.getDenominator()*f2.getNumerator());
        return result;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
