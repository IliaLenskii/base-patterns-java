
package base.patterns.behavioral.templatemethod;

public class Monopoly extends AbstractGame {
    
    @Override
    protected void initializeGame() {
        
        System.out.println("Monopoly specific initialization actions");
    }

    @Override
    protected void playGame() {
        
        System.out.println("Monopoly specific play actions");
    }

    @Override
    protected void endGame() {
        
        System.out.println("Monopoly specific actions to end a game");
    }

    @Override
    protected void printWinner() {
        
        System.out.println("Monopoly specific actions to print winner");
    }
}
