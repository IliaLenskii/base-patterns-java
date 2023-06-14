
package base.patterns.behavioral.chainresponsibility;

public class StdoutLogger extends AbstractLogger {
    
    public StdoutLogger(int mask) { 

        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {

        System.out.println("Writing to stdout: " + msg);
    }
}
