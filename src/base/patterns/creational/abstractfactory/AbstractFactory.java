package base.patterns.creational.abstractfactory;

import base.patterns.creational.factory.*;

public class AbstractFactory {
    
    public static void main(String[] args) {
        
        //System.out.println(" AbstractFactory ");
        
        ICarsFactory factory = new ToyotaFactory();
        
        factory.createCoupe();
        factory.createSedan();        
    }
}
