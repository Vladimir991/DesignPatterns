package ChapterTwo.PatternObserver;

/**
 * Created by Zhelezyaka on 18.10.2017.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
