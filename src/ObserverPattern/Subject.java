package ObserverPattern;

/**
 * Created by amitkumar on 15/10/17.
 */
public interface Subject {
    public void register(Observer o);
    public void unRegister(Observer o);
    public void notifyObserver();
}
