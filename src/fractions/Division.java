package fractions;

public class Division implements BinaryOperator {    
    
    Division() {        
    }

    @Override
    public Fraction operate(Fraction firstArgument, Fraction secondArgument) {
        
        int a = firstArgument.getNumerator()*secondArgument.getDenominator();
        int b = firstArgument.getDenominator()*secondArgument.getNumerator();
        Fraction result = new Fraction(a,b);
        return result;
    }

    @Override
    public String explainOperation(Fraction firstArgument, Fraction secondArgument) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}