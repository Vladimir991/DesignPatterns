package ChapterOne.FamiliarityWithThePatterns.SimUDuck;

/**
 * Created by Zhelezyaka on 17.10.2017.
 */
public class MallardDuck extends Duck {
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
