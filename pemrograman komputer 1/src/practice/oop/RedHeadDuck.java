package practice.oop;

import java.nio.file.Paths;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display(){
        System.out.println("I'm a real Red Headed Duck");
    }
}
