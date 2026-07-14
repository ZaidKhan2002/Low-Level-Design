package com.zaid.lld.fundamentals.solid.isp.good;

public class Main {

    public static void main(String[] args) {

        Printable basicPrinter = new BasicPrinter();

        basicPrinter.print();

        System.out.println();

        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();

        allInOnePrinter.print();
        allInOnePrinter.scan();
        allInOnePrinter.fax();

    }

}
