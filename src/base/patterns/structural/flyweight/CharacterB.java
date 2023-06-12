
package base.patterns.structural.flyweight;

public class CharacterB extends AbstractEnglishCharacter {

    public CharacterB() {

        symbol = 'B';

        width = 20;

        height = 30;
    }

    @Override
    public void printCharacter() {

        System.out.println("Symbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}
