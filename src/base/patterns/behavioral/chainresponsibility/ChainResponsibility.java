package base.patterns.behavioral.chainresponsibility;

public class ChainResponsibility {

    public static void main(String[] args) {

        AbstractLogger logger, logger1, logger2;
        
        logger = new StdoutLogger(AbstractLogger.DEBUG);

        logger1 = logger.setNext(new EmailLogger(AbstractLogger.NOTICE));
        logger2 = logger1.setNext(new StderrLogger(AbstractLogger.ERR));

        logger.message("Entering function y.", AbstractLogger.DEBUG);

        logger.message("Step1 completed.", AbstractLogger.NOTICE);

        logger.message("An error has occurred.", AbstractLogger.ERR);
    }
}
