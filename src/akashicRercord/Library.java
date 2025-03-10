package akashicRercord;

import customDS.ArrayListCustom;

import java.awt.print.Book;

public class Library implements ISubject{

    private ArrayListCustom<Akasha> akashas;
    private ArrayListCustom<Member> members;
    private ArrayListCustom<IObserver> observers ;



    @Override
    public void attachObserver(IObserver observer) {

    }

    @Override
    public void detachObserver(IObserver observer) {

    }

    @Override
    public void notifyObservers(Object arg) {

    }
}
