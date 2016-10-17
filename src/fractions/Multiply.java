package fractions;

public class Multiply implements BinaryOperator {   

    public Multiply() {    
    }      
    
    @Override
    public Fraction operate(Fraction firstArgument, Fraction secondArgument) {
        int operateOne = firstArgument.getNumerator() * secondArgument.getNumerator();
        int operateTwo = firstArgument.getDenominator() * secondArgument.getDenominator();
        Fraction result = new Fraction(operateOne, operateTwo);
        return result;
    }

    @Override
    public String explainOperation(Fraction firstArgument, Fraction secondArgument) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
