
package base.patterns.behavioral.observer;

public class Observer {
    
    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();

        IObserver currentDisplay = new CurrentConditionsDisplay ();

        weatherData.registerObserver(currentDisplay);

        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}
