package StrategyPattern;

/**
 * Created by amitkumar on 15/10/17.
 */
public class AnimalPlay {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog :"+ sparky.tryToFly());
        System.out.println("Bird :"+ tweety.tryToFly());

        sparky.setFlyingAbility(new ItFly());
        System.out.println("Dog :"+ sparky.tryToFly());
    }
}
