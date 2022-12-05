package it.sixthExercise;

public class Shape {
    //Instance variables
    public String shapeName;
    public int numberOfEdges;
    public double radius;
    public int edges;
    public double edgeLength;
    public double e1;
    public double e2;
    public double e3;


    //Undefined shape
    Shape() {
        System.out.println("This shape is a.....");
        shapeName = "Undefined shape";
    }

    //Circle shape
    Shape(double radius) {
        System.out.println("We are creating a circle");
        shapeName = "Circle";
        this.radius = radius;
    }

    //Square shape
    Shape(int edges, double edgeLength) {
        System.out.println("We are creating a square");
        this.shapeName = "Square";
        numberOfEdges = 4;

    }

    //Rectangle shape
    Shape(int edges, double e1, double e2) {
        System.out.println("We are creating a rectangle");
        this.shapeName = "Rectangle";
        numberOfEdges = 4;

    }

    //Triangle shape
    Shape(int edges, double e1, double e2, double e3) {
        System.out.println("We are creating a triangle");
        this.shapeName = "Triangle";
        numberOfEdges = 3;
    }

    public void getShapeDetails() {
        System.out.println("This is a " + shapeName + " with " + numberOfEdges + " edges");
    }


}
