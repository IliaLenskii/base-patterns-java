
package base.patterns.behavioral.templatemethod;


public class Chess extends AbstractGame {
    
    @Override
    protected void initializeGame() {
        
        System.out.println("Chess specific initialization actions");
    }

    @Override
    protected void playGame() {
        
        System.out.println("Chess specific play actions");
    }

    @Override
    protected void endGame() {
        
        System.out.println("Chess specific actions to end a game");
    }

    @Override
    protected void printWinner() {
        
        System.out.println("Chess specific actions to print winner");
    }
}
