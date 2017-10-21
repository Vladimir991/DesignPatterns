package ChapterThree.PatternDecorator.starbuzzCoffee;

/**
 * Created by Zhelezyaka on 21.10.2017.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
