
package base.patterns.behavioral.templatemethod;

public abstract class AbstractGame {
    
    private int playersAmount;

    protected abstract void initializeGame();

    protected abstract void playGame();

    protected abstract void endGame();

    protected abstract void printWinner();

    public final void playOneGame(int playersAmount){

        setPlayersAmount(playersAmount);

        initializeGame();
        playGame();
        endGame();

        printWinner();
    }

    public void setPlayersAmount(int playersAmount){

        this.playersAmount = playersAmount;
    }
}
