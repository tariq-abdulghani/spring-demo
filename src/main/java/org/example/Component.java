package org.example;

public class Component {

   private Printer printer;

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(){
        printer.print();
    }
}
