package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module04.shape;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }
}
