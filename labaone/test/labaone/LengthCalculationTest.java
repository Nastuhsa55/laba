/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labaone;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;


public class LengthCalculationTest {

    @Test
    public void testAverageStringLength() {
       
        String[] lines = {"dddd","dd"};
        LengthCalculation instance = new LengthCalculation();
        
        float result = instance.averageStringLength(lines);
        assertEquals(3, result, 0.0);
        
        
    }

    @Test
    public void testDerivation() {
        String[] lines = {"dddd","dd"};
        LengthCalculation instance = new LengthCalculation();
        ArrayList<String> result = instance.derivation(lines);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("dd");
        assertEquals(expected, result);
        
    }

}
