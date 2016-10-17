package fractions;

import java.util.ArrayList;
import java.util.Arrays;

public class RandomCollection {

    public static void newFractionCollection(int size) {

        
        ArrayList<Fraction> fractionCollection = new ArrayList<Fraction>(size);

        for (int i = 0; i < size; i++) {
            int d = (int) (Math.random() * 100);
            int n = (int) (Math.random() * 100);            
            Fraction f = new Fraction(d, n);
            fractionCollection.add(f);

        }

        System.out.println("\n" + "Coleccion de Fracciones: " + "\n");
        
        for (Fraction fraction : fractionCollection) {
            System.out.println(fraction);
        }

        for (Fraction fraction : fractionCollection) {
             fraction.simplify();
         }
         
        
        System.out.println("\n" + "Fracciones simplificadas: " + "\n");
        
         for (Fraction fraction : fractionCollection) {
             System.out.println(fraction);
         }
         
         Fraction[] fractionArray = new Fraction[size];

         fractionCollection.toArray(fractionArray);
         Arrays.sort(fractionArray);
         
         System.out.println("\n" + "Fracciones simplificadas y ordenadas: " + "\n");
         
         for (Fraction fraction : fractionArray) {
             System.out.println(fraction);
         }
    }

}
