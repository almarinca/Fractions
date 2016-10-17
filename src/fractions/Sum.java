package fractions;

public class Sum implements BinaryOperator {

    public Sum() {
    }
    
    @Override
    public Fraction operate(Fraction firstArgument, Fraction secondArgument) {
       int a = firstArgument.getNumerator()* secondArgument.getDenominator();
       int b =firstArgument.getDenominator() * secondArgument.getNumerator();
       int c = firstArgument.getDenominator() * secondArgument.getDenominator();
       int d = a + b;
       
       Fraction result = new Fraction(d,c);
       return result;
  
        
        
    }

    @Override
    public String explainOperation(Fraction firstArgument, Fraction secondArgument) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}