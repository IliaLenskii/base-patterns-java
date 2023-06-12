
package base.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements IGraphic {

    private final List<IGraphic> childGp = new ArrayList<>();

    @Override
    public void print() {

        for (IGraphic graphic : childGp) {
             graphic.print();
         }
    }

    public void add(IGraphic graphic) {

        childGp.add(graphic);
    }

    public void remove(IGraphic graphic) {

        childGp.remove(graphic);
    }
}