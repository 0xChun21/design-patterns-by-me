package akashicRercord;


import java.util.StringJoiner;

public class Akasha {
    private String id;
    private String title;
    private String author;
    private String description;
    private String publisher;
    private boolean isRent;

     Akasha(){

    }

    public Akasha(String id, String title, String author, String description, String publisher, boolean isRent) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.publisher = publisher;
        this.isRent = isRent;
    }

    @Override
    public String toString() {
        StringJoiner akashaInformation = new StringJoiner(",");
        akashaInformation.add(id);
        akashaInformation.add(title);
        akashaInformation.add(author);
        akashaInformation.add(description);
        akashaInformation.add(publisher);
        if(isRent){
            akashaInformation.add("Da muon");
        }else{
            akashaInformation.add("Chua duoc muon");
        }
        return akashaInformation.toString();
    }
}
