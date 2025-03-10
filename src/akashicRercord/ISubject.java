package akashicRercord;

import java.util.Observer;

public interface ISubject {

    void attachObserver(IObserver observer);
    void detachObserver(IObserver observer);
    void notifyObservers(Object arg);
}
