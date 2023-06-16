
package base.patterns.behavioral.iterator;

public class Iterator {
    
    public static void main (String[] args) {

        
        JavaDeveloper jd = new JavaDeveloper(
            "Garry",
            (new String[]{"java", "core", "spring"})
        );
        
        IIterator iterator = jd.getIterator();
        
        while (iterator.hasNext()) {
            
            System.out.println( iterator.next().toString() );
        }
    }
}
