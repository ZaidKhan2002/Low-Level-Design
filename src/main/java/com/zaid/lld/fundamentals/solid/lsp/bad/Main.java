package com.zaid.lld.fundamentals.solid.lsp.bad;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Square();

        rectangle.setWidth(5);
        rectangle.setHeight(10);

        System.out.println("Expected Area : 50");
        System.out.println("Actual Area   : " + rectangle.getArea());

    }
}
