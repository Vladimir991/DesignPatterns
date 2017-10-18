package ChapterTwo.PatternObserver;

/**
 * Created by Zhelezyaka on 18.10.2017.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
