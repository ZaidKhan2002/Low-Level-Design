package com.zaid.lld.fundamentals.solid.lsp.good;

public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(10);

        System.out.println("Rectangle Area : " + rectangle.getArea());
        System.out.println("Square Area    : " + square.getArea());

    }
}
