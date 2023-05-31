package base.patterns.creational.prototype;

public class Prototype {
    
    private Cookie cookie;

    public Prototype(Cookie cookie) {

        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException {

        return (Cookie) cookie.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        
        Cookie cookies = new ChocolateCookies(80, 160);
        
        Prototype cookMachine = new Prototype(cookies);

        System.out.println( cookMachine.makeCookie() );
        System.out.println( cookMachine.makeCookie() );
        System.out.println( cookMachine.makeCookie() );
    }
}
