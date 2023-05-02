    package org.example;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.color = "black";
        triangle1.base = 10;
        triangle1.height = 5;
        System.out.println(triangle1.toString());

        Triangle triangle2 = new Triangle();
        triangle2.color = "blue";
        triangle2.base = 4;
        triangle2.height = 9;
        System.out.println(triangle2.toString());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.color = "green";
        rectangle1.width = 8;
        rectangle1.length = 7;
        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.color = "red";
        rectangle2.width = 11;
        rectangle2.length = 3;
        System.out.println(rectangle2.toString());
    }
}