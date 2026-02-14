package org.example.solid.lsp;

public class LSPDemo {

    public static void main(String[] args) {

        Rectangle rectangle = new Square();

        rectangle.setWidth(5);
        rectangle.setHeight(10);

        System.out.println("Area: " + rectangle.getArea());
    }
}
