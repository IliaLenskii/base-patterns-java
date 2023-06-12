
package base.patterns.structural.flyweight;

public class CharacterA extends AbstractEnglishCharacter {

    public CharacterA() {

        symbol = 'A';

        width = 10;

        height = 20;
    }

    @Override
    public void printCharacter() {

        System.out.println("Symbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}
