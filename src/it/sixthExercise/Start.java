package it.sixthExercise;

public class Start {
    public static void main(String[] args) {

        Shape undefinedShape = new Shape();
        Shape circle = new Shape(1.5);
        Shape square = new Shape(4, 2.5);
        Shape rectangle = new Shape(4, 1.5, 2.5);
        Shape triangle = new Shape(3, 2.5, 3.5, 4.5);


        undefinedShape.getShapeDetails();
        circle.getShapeDetails();
        square.getShapeDetails();
        rectangle.getShapeDetails();
        triangle.getShapeDetails();


    }


}
