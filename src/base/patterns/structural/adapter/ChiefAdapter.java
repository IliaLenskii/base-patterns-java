
package base.patterns.structural.adapter;

public class ChiefAdapter extends Plumber implements IChief {

    @Override
    public void makeBreakfast() {
        
        getGasket();
    }

    @Override
    public void makeLunch() {
        
        getPipe();
    }

    @Override
    public void makeDinner() {
        
        getScrewNut();
    }
}
