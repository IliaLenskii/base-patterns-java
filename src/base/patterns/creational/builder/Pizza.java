
package base.patterns.creational.builder;

public class Pizza {
    
    private String dough;
    private String sauce;
    private String topping;

    public void setDough(String dough) {

        dough = dough;
        
        System.out.println("+ "+ dough);
    }
    
    public void setSauce(String sauce) {

        sauce = sauce;
        
        System.out.println("+ "+ sauce);
    }
    
    public void setTopping(String topping) {

        topping = topping;
        
        System.out.println("+ "+ topping);
    }
}
