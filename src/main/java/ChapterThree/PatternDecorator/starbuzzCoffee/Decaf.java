package ChapterThree.PatternDecorator.starbuzzCoffee;

/**
 * Created by Zhelezyaka on 21.10.2017.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
