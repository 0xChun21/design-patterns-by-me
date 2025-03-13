package akashicRercord.decoratorPattern;

public class AddendumDecorator implements IBook {

     IBook item;

    public AddendumDecorator(IBook item) {
        this.item = item;
    }

    @Override
    public String getInformation() {
        return item.getInformation();
    }

    @Override
    public Double getCost() {
        return item.getCost();
    }
}
