package akashicRercord.decoratorPattern;

public class OriginalBook implements IBook {
    private String title;
    private String author;

    public OriginalBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public OriginalBook(){

    }

    @Override
    public String getInformation() {
        return "user borrowed " + title + " - " + author + " - " + "Addendum" + "- ";
    }

    @Override
    public Double getCost() {
        return 5.0;
    }
}

