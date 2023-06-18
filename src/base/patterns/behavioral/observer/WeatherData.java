
package base.patterns.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements IObservable {
    
    private List<IObserver> observers = new LinkedList<>();

    private float temperature;
    private float humidity;
    private int pressure;
    
    /*
    public WeatherData() {
    } */
    
    @Override
    public void registerObserver(IObserver o) {

        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {

        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        for(IObserver observer : observers)
            observer.update(temperature, humidity, pressure);
    }
         
    public void setMeasurements(float temperature, float humidity, int pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }
}
