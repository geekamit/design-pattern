package StrategyPattern;

/**
 * Created by amitkumar on 15/10/17.
 */
public class CantFly implements Flys {

    @Override
    public String fly() {
        return "I can not fly";
    }
}
