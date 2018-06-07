package pl.cschool.taskset2.fraction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void test1() {
        assertEquals(7,Fraction.add(new Fraction(1,2),new Fraction(2,3)).getNumerator());
        assertEquals(6,Fraction.add(new Fraction(1,2),new Fraction(2,3)).getDenominator());
    }

    @Test
    public void test2() {
        assertEquals(1,Fraction.substract(new Fraction(2,3),new Fraction(1,2)).getNumerator());
        assertEquals(6,Fraction.substract(new Fraction(2,3),new Fraction(1,2)).getDenominator());
    }

    @Test
    public void test3() {
        assertEquals(8,Fraction.multiply(new Fraction(2,3),new Fraction(4,5)).getNumerator());
        assertEquals(15,Fraction.multiply(new Fraction(2,3),new Fraction(4,5)).getDenominator());
    }

    @Test
    public void test4() {
        assertEquals(10,Fraction.divide(new Fraction(2,3),new Fraction(4,5)).getNumerator());
        assertEquals(12,Fraction.divide(new Fraction(2,3),new Fraction(4,5)).getDenominator());
    }
}
