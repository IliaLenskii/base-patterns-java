
package base.patterns.behavioral.interpreter;

import java.util.Stack;

public class Evaluate implements IExpression {
    private IExpression evalte;
    
    public Evaluate(String exp) {
        
        String revExp = new StringBuilder(exp).reverse().toString();

        Stack<IExpression> expsStack = new Stack<>();
        
        for(String s : revExp.split("\\D")) {
            
            expsStack.push( new Number( Double.parseDouble( s ) ) ); 
        }
        
        for(String s: exp.split("\\d")) {
            
            if(s.equals("+")) {
                
                expsStack.push( new Plus(expsStack.pop(), expsStack.pop()) );
                
            } else if(s.equals("-")) {
             
                expsStack.push( new Minus(expsStack.pop(), expsStack.pop()) );
            }
        }
        
        evalte = expsStack.pop();
    }

    @Override
    public double interpreter(IExpression context) {
        
        return evalte.interpreter(context);
    }
}
