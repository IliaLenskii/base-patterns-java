
package base.patterns.behavioral.interpreter;

public class Plus implements IExpression {
    private IExpression expLeft;
    private IExpression expRight;

    public Plus(IExpression expLeft, IExpression expRight) {

        this.expLeft = expLeft;
        this.expRight = expRight;
    }

    @Override
    public double interpreter(IExpression context) {

        return expLeft.interpreter(context) + expRight.interpreter(context);
    }
}
