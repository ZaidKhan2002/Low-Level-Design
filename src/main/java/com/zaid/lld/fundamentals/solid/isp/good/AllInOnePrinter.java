package com.zaid.lld.fundamentals.solid.isp.good;

public class AllInOnePrinter implements Printable, Scannable, Faxable {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document...");
    }

}
