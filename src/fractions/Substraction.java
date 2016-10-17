package fractions;

public class Substraction implements BinaryOperator {
    
       @Override
    public Fraction operate(Fraction firstArgument, Fraction secondArgument) {
        
        int a;
        int b;
        int c;
        int d;
       // return thirthArgument = firstArgument - secondArgument;
         a = firstArgument.getNumerator();
         b = secondArgument.getNumerator();
         c = firstArgument.getDenominator();
         d = secondArgument.getDenominator();
         
         int e = ((a * d) - (b * c));
                 
         int f = (c*d);  
         
         Fraction result = new Fraction(e,f);
        
         return result;      
                        
    }

    @Override
    public String explainOperation(Fraction firstArgument, Fraction secondArgument) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }     
}