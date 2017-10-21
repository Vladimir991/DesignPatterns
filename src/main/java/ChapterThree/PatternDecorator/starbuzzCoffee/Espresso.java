package ChapterThree.PatternDecorator.starbuzzCoffee;

/**
 * Created by Zhelezyaka on 21.10.2017.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
