
package base.patterns.behavioral.chainresponsibility;

public class StderrLogger extends AbstractLogger {
    
    public StderrLogger(int mask) {
        
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {

        System.out.println("Sending to stderr: " + msg);
    }
}
