
package base.patterns.behavioral.visitor;

public interface IVisitor {
    
    void visit (Point2d p);

    void visit (Point3d p);
}
