
package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Dap {
    public boolean Map (String text){
        Pattern p1 = Pattern.compile("([a-fA-F0-9]{2}:){5}" + "[a-fA-F0-9]{2}"); 
        Matcher m1 = p1.matcher( text );
        boolean b = m1.matches();
        return b;
    }
}
