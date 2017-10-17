package ChapterOne.FamiliarityWithThePatterns.SimUDuck;

/**
 * Created by Zhelezyaka on 17.10.2017.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Silence! I don't know how to quack.");
    }
}
