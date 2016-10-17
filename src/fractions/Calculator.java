package fractions;
import java.util.ArrayList;

public class Calculator {

    public static void calculate(Fraction f1, Fraction f2) {

                
        Sum s = new Sum();       
        Substraction r = new Substraction();        
        Multiply m = new Multiply();       
        Division d = new Division();
        

        ArrayList<BinaryOperator> operations = new ArrayList<BinaryOperator>();

        operations.add(s);
        operations.add(r);
        operations.add(m);
        operations.add(d);

        int i=0;
        String operacion = "";

        for (BinaryOperator operation : operations) {
            if (i == 0){operacion = "suma";}
            else if(i == 1){operacion = "resta";}
            else if(i == 2){operacion = "multiplicación";}
            else if(i == 3){operacion = "división";}
            
            System.out.println("el resultado de la operacion " + operacion + " entre " + f1 + " y " + f2 + " es: " +operation.operate(f1, f2));
            i++;
        }
    }

    }

