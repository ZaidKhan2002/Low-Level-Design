package com.zaid.lld.fundamentals.solid.isp.bad;

public class BasicPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Basic Printer cannot scan.");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Basic Printer cannot fax.");
    }

}
