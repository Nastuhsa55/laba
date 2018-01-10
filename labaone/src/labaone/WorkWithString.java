package labaone;

import java.util.*;

public class WorkWithString {

    public static void main(String[] args) throws java.lang.Exception {
        String[] line;
        
        LengthCalculation lengthCalculator = new LengthCalculation();
        try {
            line = lengthCalculator.inputStrings();
            
        } catch (InputMismatchException e) {

            System.err.print("Вы ввели не число. ");
            return;
        }

        float averageLength = lengthCalculator.averageStringLength(line);
        System.out.println("Строки с длиной меньше средней (" + averageLength + "):");
        ArrayList<String> result = lengthCalculator.derivation(line); 
        lengthCalculator.outputStrings(result.toArray(new String[result.size()]));
        
    }
}
