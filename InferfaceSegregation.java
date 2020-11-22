package com.solidprinciples;

interface Worker{
    abstract void work();
}
interface Sleeper{
    abstract void Sleep();
}
class Human implements Worker, Sleeper{

    @Override
    public void work() {
        System.out.println("Human can work");
    }

    @Override
    public void Sleep() {
        System.out.println("Human can Sleep");
    }
}
class Robot implements Worker{

    @Override
    public void work() {
        System.out.println("Robot can work");
    }
}

public class InferfaceSegregation {
    public static void main(String[] args) {
        Human hu = new Human();
        hu.Sleep();hu.work();
        Robot ro = new Robot();
        ro.work();
    }
}
