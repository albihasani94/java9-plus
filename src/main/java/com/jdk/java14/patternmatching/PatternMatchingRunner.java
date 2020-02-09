package com.jdk.java14.patternmatching;

public class PatternMatchingRunner {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        sayYourShape(triangle);
        sayYourShapeImproved(rectangle);
        sayYourShapeImproved(circle);

    }

    private static void sayYourShape(Shape shape) {
        if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            triangle.sayIamATriangle();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            circle.sayIamACircle();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            rectangle.sayIamARectangle();
        }
    }

    private static void sayYourShapeImproved(Shape shape) {
        if (shape instanceof Triangle triangle) {
            triangle.sayIamATriangle();
        } else if (shape instanceof Circle circle) {
            circle.sayIamACircle();
        } else if (shape instanceof Rectangle rectangle) {
            rectangle.sayIamARectangle();
        }
    }

    // Waiting for JDK 15
    /*sealed interface Shape permits Circle, Triangle, Rectangle { }
    private record Triangle (int base, int height) implements Rectangle;

    int area (Shape shape) {
        if (shape instanceof Triangle(int base, int height)) {
            return base*height/2;
        }
    }*/

}
