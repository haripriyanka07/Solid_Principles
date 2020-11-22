package com.solidprinciples;

abstract class shape{
    abstract void areaCalculator();
}
class circle extends shape{
    int radius;
    public circle(int radius){
        this.radius = radius;
    }
    @Override
    void areaCalculator() {
        System.out.println("Cricle area "+3.14 * radius * radius);
    }
}
class rectangle extends shape{
    double height;
    double width;

    public rectangle(double height, double width){
        this.width = width;
        this.height = height;
    }
    @Override
    void areaCalculator() {
        System.out.println("Rectangle area "+height * width);
    }
}
class triangle extends shape{
    double height;
    double base;

    public triangle(double height, double base){
        this.base = base;
        this.height = height;
    }
    @Override
    void areaCalculator() {
        System.out.println("Triangle area "+0.5 * height * base);
    }
}
class Areacal{
    public void cal(shape shape){
        shape.areaCalculator();
    }
}
public class OpenClose {
    public static void main(String[] args) {
        Areacal area = new Areacal();
        area.cal(new rectangle(26, 22));
        area.cal(new triangle(10,5));
        area.cal(new circle(7));
    }
}
