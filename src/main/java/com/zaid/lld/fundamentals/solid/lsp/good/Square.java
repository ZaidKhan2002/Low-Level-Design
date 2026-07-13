package com.zaid.lld.fundamentals.solid.lsp.good;

public class Square implements Shape {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}