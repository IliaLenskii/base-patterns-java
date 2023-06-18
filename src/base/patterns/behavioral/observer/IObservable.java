
package base.patterns.behavioral.observer;

public interface IObservable {

    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObservers();
}
