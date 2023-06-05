
package base.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

    private final List<Graphic> childGp = new ArrayList<>();

    @Override
    public void print() {

        for (Graphic graphic : childGp) {
             graphic.print();
         }
    }

    public void add(Graphic graphic) {

        childGp.add(graphic);
    }

    public void remove(Graphic graphic) {

        childGp.remove(graphic);
    }
}