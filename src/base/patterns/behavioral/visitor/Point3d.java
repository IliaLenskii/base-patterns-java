
package base.patterns.behavioral.visitor;

public class Point3d extends AbstractPoint {

    public Point3d (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void accept (IVisitor v) {

        v.visit( this );
    }

    private final double x;
    public double getX () { return x; }

    private final double y;
    public double getY () { return y; }

    private final double z;
    public double getZ () { return z; }
}
