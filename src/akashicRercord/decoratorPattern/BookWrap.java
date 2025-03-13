package akashicRercord.decoratorPattern;

public class BookWrap extends AddendumDecorator{

    public BookWrap(IBook item) {
        super(item);
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "+ add book wrap ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 1;
    }
}
