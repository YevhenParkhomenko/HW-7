package com.yevhen_parkhomenko.main;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.getSquareArea());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getRectangleArea());
    }
}