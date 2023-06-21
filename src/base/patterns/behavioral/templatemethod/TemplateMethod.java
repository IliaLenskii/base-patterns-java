
package base.patterns.behavioral.templatemethod;

public class TemplateMethod {
    
    public static void main(String[] args) {
        
        AbstractGame chess = new Chess();
        AbstractGame monopoly = new Monopoly();

        chess.playOneGame(2);

        monopoly.playOneGame(5);

    }
}
