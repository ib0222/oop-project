package org.example;

public class Rectangle extends Shape {
    public int length;
    public int width;

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public String toString() {
        return "Shape is rectangle\n" +
                "Color: " + this.color + "\n" +
                "Length: " + this.length + "\n" +
                "Width: " + this.width + "\n" +
                "Area: " + this.getArea() + "\n";
    }

}
