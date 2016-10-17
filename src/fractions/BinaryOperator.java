package fractions;

public interface BinaryOperator {

	Fraction operate(Fraction firstArgument, Fraction secondArgument);
	
	String explainOperation(Fraction firstArgument, Fraction secondArgument);

}