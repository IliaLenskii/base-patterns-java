package base.patterns.creational.builder;

public class Builder {

    public static void main(String[] args) {
        
        Waiter waiter = new Waiter();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}
