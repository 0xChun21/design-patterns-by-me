package akashicRercord.decoratorPattern;

public class HardCover extends AddendumDecorator{
    public HardCover(IBook item) {
        super(item);
    }

    @Override
    public String getInformation() {
        return super.getInformation() + " +add hard cover ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 5.0;
    }
}
