package fractions;

public class Fraction implements Comparable<Fraction> {

    final private static String fractionDivider = "/";
    private int numerator;
    private int denominator;

    /**
     * If denominator is 0 sets it as 1
     *
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator != 0 ? denominator : 1;
        //simplify();
    }

    public Fraction() {
        this(0, 1);
    }

    public void simplify() {

        int mcd = 1;
        int a = this.denominator;
        int b = this.numerator;

        do {
            if (b == 0) {
                mcd = a;
            } else {
                int modulus = a % b;
                a = b;
                b = modulus;
            }
        } while (mcd != a);

        this.denominator = this.denominator / mcd;
        this.numerator = this.numerator / mcd;

    }

    @Override
    public String toString() {
        return numerator + fractionDivider + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public int compareTo(Fraction f) {

        int result;
        double a = (double) this.numerator / (double) this.denominator;
        double b = (double) f.numerator / (double) f.denominator;

        if (a < b) {
            result = -1;
        } else if (a > b) {
            result = 1;
        } else {
            result = 0;
        }

        return result;

    }

    public static void main(String[] args) {

        /*
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(5, 0);
        Fraction f3 = new Fraction(212, 64);

        System.out.println("First fraction:" + f1);
        System.out.println("Second fraction:" + f2);
        System.out.println("Third fraction:" + f3);
        System.out.println("Fractions work!!");

        Calculator.calculate(f2, f3);
        */
        
        RandomCollection.newFractionCollection(10);
    }
}
