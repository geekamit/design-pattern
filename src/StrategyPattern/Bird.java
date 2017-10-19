package StrategyPattern;

/**
 * Created by amitkumar on 15/10/17.
 */
public class Bird extends Animal{
    public Bird(){
        super();
        setSound("Tweet");
        flyingType = new ItFly();
    }
}
