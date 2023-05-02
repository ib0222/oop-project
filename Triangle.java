package org.example;

public class Triangle extends Shape {
    public int base;
    public int height;

    @Override
    public double getArea() {
        double area = base * height;
        return area;
    }

    @Override
    public String toString() {
        return "Shape is triangle\n" +
                "Color: " + this.color + "\n" +
                "Base: " + this.base + "\n" +
                "Height: " + this.height + "\n" +
                "Area: " + this.getArea() + "\n";
    }
}
