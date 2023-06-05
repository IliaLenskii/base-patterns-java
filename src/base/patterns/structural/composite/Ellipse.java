
package base.patterns.structural.composite;


public class Ellipse implements Graphic {

    @Override
    public void print() {
        
        System.out.println( ">> "+ this.getClass().getSimpleName() );
    }
}