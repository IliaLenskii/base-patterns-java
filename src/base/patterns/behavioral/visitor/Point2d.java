
package base.patterns.behavioral.visitor;

public class Point2d extends AbstractPoint {
    
    public Point2d (double x, double y) {
        
        this.x = x;
        this.y = y;
    }

    @Override
    public void accept (IVisitor v) {

        v.visit( this );
    }

    private final double x;
    public double getX () {

        return x;
    }

    private final double y;
    public double getY () {

        return y;
    }
}
