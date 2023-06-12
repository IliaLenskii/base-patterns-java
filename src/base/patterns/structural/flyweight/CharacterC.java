
package base.patterns.structural.flyweight;

public class CharacterC extends AbstractEnglishCharacter {
    
    public CharacterC(){

        symbol = 'C';

        width = 40;

        height = 50;
    }

    @Override
    public void printCharacter() {
        
        System.out.println("Symbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}