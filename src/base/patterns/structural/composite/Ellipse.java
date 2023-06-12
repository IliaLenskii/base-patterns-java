
package base.patterns.structural.composite;


public class Ellipse implements IGraphic {

    @Override
    public void print() {
        
        System.out.println( ">> "+ this.getClass().getSimpleName() );
    }
}