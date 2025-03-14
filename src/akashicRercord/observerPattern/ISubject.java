package akashicRercord.observerPattern;

public interface ISubject {

    public void attachObserver(INotifyObserver notifyObserver);
    public void detachObserver(INotifyObserver notifyObserver);
    public void notifyObservers();
}
