
package base.patterns.behavioral.interpreter;

public class Number implements IExpression {
    
    private double number;

    public Number(double number) {

        this.number = number;
    }

    @Override
    public double interpreter(IExpression context) {

        return number;
    }
}
