
package base.patterns.structural.flyweight;

public class Flyweight {

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        int [] characterCodes = {1, 2, 3};

        for (int nextCode : characterCodes) {
            
            AbstractEnglishCharacter character = factory.getCharacter(nextCode);
            
            character.printCharacter();
        }
    }
}