package akashicRercord.builderPattern;

import akashicRercord.Akasha;

public class AkashaBuilder implements IAkashaBuilder {
    private String id;
    private String title;
    private String author;
    private String description;
    private String publisher;
    private boolean isRent;

    public AkashaBuilder(String id, String title, String author, String description, String publisher, boolean isRent) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.publisher = publisher;
        this.isRent = isRent;
    }

    public AkashaBuilder() {
    }

    @Override
    public AkashaBuilder addId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public AkashaBuilder addTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public AkashaBuilder addAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public AkashaBuilder addDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public AkashaBuilder addPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    @Override
    public AkashaBuilder addIsRent(boolean isRent) {
        this.isRent = isRent;
        return this;
    }

    @Override
    public Akasha build() {
        return new Akasha(id, title, author, description, publisher, isRent);
    }
}
