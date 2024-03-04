package org.example.homework8;

abstract class Shape {
    abstract void printName();
}

class Circle extends Shape {
    @Override
    void printName() {
        System.out.println("Circle");
    }
}

class Square extends Shape {
    @Override
    void printName() {
        System.out.println("Square");
    }
}

class Rectangle extends Shape {
    @Override
    void printName() {
        System.out.println("Rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void printName() {
        System.out.println("Triangle");
    }
}

class Ellipse extends Shape {
    @Override
    void printName() {
        System.out.println("Ellipse");
    }
}

class ShapeNamePrinter {
    void printShapeName(Shape shape) {
        shape.printName();
    }
}

class Main {
    public static void main(String[] args) {
        ShapeNamePrinter printer = new ShapeNamePrinter();

        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Ellipse ellipse = new Ellipse();

        printer.printShapeName(circle);
        printer.printShapeName(square);
        printer.printShapeName(rectangle);
        printer.printShapeName(triangle);
        printer.printShapeName(ellipse);
    }
}