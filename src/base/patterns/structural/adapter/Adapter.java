package base.patterns.structural.adapter;

public class Adapter {
    
    public static void main(String[] args) {
        
        IChief cf = new ChiefAdapter();
        
        cf.makeBreakfast();
        cf.makeLunch();
        cf.makeDinner();
    }
}
