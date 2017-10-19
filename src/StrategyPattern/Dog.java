package StrategyPattern;

/**
 * Created by amitkumar on 15/10/17.
 */
public class Dog extends Animal {

    public Dog(){
        super();
        setSound("Barks");
        flyingType = new CantFly();
    }

}
