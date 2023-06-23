
package base.patterns.behavioral.visitor;

public abstract class AbstractPoint {
    
    private double metric = -1;

    public abstract void accept (IVisitor v);
    
    public double getMetric () {
        
        return metric;
    }
    
    public void setMetric (double metric) {

        this.metric = metric;
    }
}
