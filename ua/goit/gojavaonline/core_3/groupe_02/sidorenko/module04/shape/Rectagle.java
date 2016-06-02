package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module04.shape;

public class Rectagle extends Shape {
    private double width;
    private double height;

    public Rectagle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
