
package base.patterns.behavioral.chainresponsibility;

abstract public class AbstractLogger {

    public final static int ERR = 3;
    public final static int NOTICE = 5;
    public final static int DEBUG = 7;

    protected int mask;

    protected AbstractLogger next;

    public AbstractLogger setNext(AbstractLogger log) {

        next = log;
        
        return log;
    }

    public void message(String msg, int priority) {

        if (priority <= mask)
            writeMessage(msg);

        if (next != null)
            next.message(msg, priority);
    }

    abstract protected void writeMessage(String msg);
}
