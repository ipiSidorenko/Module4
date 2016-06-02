package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module04.shape;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(String.format("Circle radius: %.2f area: %.2f", circle.getRadius(), ShapeArea.getArea(circle)));

        Triangle triangle = new Triangle(10, 5);
        System.out.println(String.format("Triangle base: %.2f height: %.2f area: %.2f", triangle.getBase(), triangle.getHigth(), ShapeArea.getArea(triangle)));

        Rectagle rectangle = new Rectagle(10, 5);
        System.out.println(String.format("Rectangle width: %.2f height: %.2f area: %.2f", rectangle.getWidth(), rectangle.getHeight(), ShapeArea.getArea(rectangle)));
    }
}

