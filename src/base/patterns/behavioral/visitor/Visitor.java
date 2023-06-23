
package base.patterns.behavioral.visitor;

public class Visitor {

    public static void main(String[] args) {

        AbstractPoint p = new Point2d(2, 4);
        IVisitor v = new Chebyshev();
        
        p.accept( v );
        
        System.out.println( p.getMetric() );
    }
}
