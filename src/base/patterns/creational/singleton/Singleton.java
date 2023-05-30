package base.patterns.creational.singleton;

public class Singleton {

    private static Singleton instance;
    private static StringBuilder logStream = new StringBuilder();

    private Singleton() {}

    public static synchronized Singleton getInstance() {

        if(instance == null)
            instance = new Singleton();

        return instance;
    }

    public void addLogInf(String str) {
        
        logStream.append( str +"\n" );
    }
    
    public void showLog() {
        
        System.out.println(logStream);
    }
    
    public static void main(String[] args) {
        
        Singleton singleton = new Singleton();
        
        singleton.addLogInf("1");
        singleton.addLogInf("2");
        singleton.addLogInf("3");
        singleton.addLogInf("4");
        
        singleton.showLog();
    }
}
