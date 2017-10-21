package ChapterThree.PatternDecorator.starbuzzCoffee;

/**
 * Created by Zhelezyaka on 21.10.2017.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
