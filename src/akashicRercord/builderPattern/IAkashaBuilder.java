package akashicRercord.builderPattern;

import akashicRercord.Akasha;

public interface IAkashaBuilder {

    AkashaBuilder addId(String id);

    AkashaBuilder addTitle(String title);

    AkashaBuilder addAuthor(String author);

    AkashaBuilder addDescription(String description);

    AkashaBuilder addPublisher(String publisher);

    AkashaBuilder addIsRent(boolean isRent);

    Akasha build();
}
