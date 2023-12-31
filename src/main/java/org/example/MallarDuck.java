package org.example;

public class MallarDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm Mallard duck");
    }
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
