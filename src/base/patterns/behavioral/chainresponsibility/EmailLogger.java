
package base.patterns.behavioral.chainresponsibility;

public class EmailLogger extends AbstractLogger {
    
    public EmailLogger(int mask) {

        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {

        System.out.println("Sending via email: " + msg);
    }
}
