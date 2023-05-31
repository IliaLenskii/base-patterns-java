
package base.patterns.creational.builder;


public class SpicyPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        
        pizza.setDough("thin dough");
    }

    @Override
    public void buildSauce() {
        
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {

        pizza.setTopping("pepperoni+salami");
    }
}
