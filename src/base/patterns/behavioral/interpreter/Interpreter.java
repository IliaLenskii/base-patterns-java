
package base.patterns.behavioral.interpreter;

public class Interpreter {
    
    public static void main(String[] args) {
        
        String exp = "4-2+1"; // 3
        
        IExpression evaprop = new Evaluate(exp);
        
        System.out.println( evaprop.interpreter(evaprop) );
    }    
}
