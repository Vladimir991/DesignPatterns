package ChapterOne.FamiliarityWithThePatterns.SimUDuck;

/**
 * Created by Zhelezyaka on 17.10.2017.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck!");
    }
}
