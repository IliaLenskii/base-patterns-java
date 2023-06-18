
package base.patterns.behavioral.observer;

public class CurrentConditionsDisplay implements IObserver {
    
    private float temperature;
    private float humidity;
    private int pressure;

    @Override
    public void update(float temperature, float humidity, int pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    public void display() {

        System.out.printf("Now: %.1f, %.1f%%, %d.\n", temperature, humidity, pressure);
    }
}
