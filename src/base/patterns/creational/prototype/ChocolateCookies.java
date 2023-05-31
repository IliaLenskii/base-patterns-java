
package base.patterns.creational.prototype;

public class ChocolateCookies extends Cookie {
    
    public ChocolateCookies(int calories, int weight) {
        
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public String toString() {

        return "Cookie{" + "calories=" + calories + ", weight=" + weight + '}';
    }
    
}
