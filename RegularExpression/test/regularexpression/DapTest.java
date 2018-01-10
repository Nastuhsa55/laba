
package regularexpression;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class DapTest {
    
    public DapTest() {
    }
 
    @Test
    public void testNap() {
       
        Dap instance = new Dap();
        boolean result = instance.Map("aE:dc:CA:56:7d:56");
        assertEquals(true, result);
        
    }
    
}
