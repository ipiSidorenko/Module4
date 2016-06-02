package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module04.shape;

public class Triangle extends Shape{

    private double base;
    private double higth;

    public Triangle(double base, double higth) {
        this.base = base;
        this.higth = higth;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHigth() {
        return higth;
    }

    public void setHigth(double higth) {
        this.higth = higth;
    }
}
