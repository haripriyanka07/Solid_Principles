package com.solidprinciples;

class Bird{
    public void name(String name){
        System.out.println("It's "+name+" bird");
    }
}
class FlyingBird extends Bird{
    public void flyingFeature(){
        System.out.println("Flying bird");
    }
}
class Sparrow extends FlyingBird{
}
class Ostrich extends Bird{
}
public class LiskovSubstitution {
    public static void main(String[] args) {
        Sparrow sp = new Sparrow();
        sp.flyingFeature();
        Ostrich ot = new Ostrich();
        ot.name("Ostrich");
    }
}
