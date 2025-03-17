package akashicRercord.decoratorPattern;

import akashicRercord.observerPattern.INotifyObserver;
import akashicRercord.observerPattern.ISubject;

public class OriginalBook implements IBook, ISubject {
    private String title;
    private String author;
    private boolean available;

    public OriginalBook(String title, String author, boolean available)  {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public OriginalBook(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String getInformation() {
        return "user borrowed " + title + " - " + author + " - " + "Addendum" + "- ";
    }

    @Override
    public Double getCost() {
        return 5.0;
    }

    @Override
    public void attachObserver(INotifyObserver notifyObserver) {

    }

    @Override
    public void detachObserver(INotifyObserver notifyObserver) {

    }

    @Override
    public void notifyObservers() {

    }
}

