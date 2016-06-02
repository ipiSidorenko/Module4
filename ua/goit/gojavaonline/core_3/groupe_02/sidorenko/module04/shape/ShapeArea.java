package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module04.shape;

public class ShapeArea {

    public static double getArea(Shape shape){
        if(shape instanceof Circle){
            Circle circle = (Circle)shape;
            return Math.PI * Math.pow(circle.getRadius(), 2);
        }

        if(shape instanceof Triangle){
            Triangle triangle = (Triangle)shape;
            return 0.5 * triangle.getBase() * triangle.getHigth();
        }

        if(shape instanceof Rectagle){
            Rectagle rectagle = (Rectagle)shape;
            return rectagle.getHeight() * rectagle.getWidth();
        }
        return 0.0;
    }

}
