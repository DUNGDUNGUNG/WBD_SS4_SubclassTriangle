package com.codegym.lop;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle + "\n");

        Triangle triangle1 = new Triangle(5, 6, 7);
        System.out.println(triangle1);
        System.out.println("area: " + triangle1.getArea());
        System.out.println("perimeter" + triangle1.getPerimeter()+"\n");

        Triangle triangle2 = new Triangle("red", false, 8, 7, 8);
        System.out.println(triangle2);

        System.out.println("\n");
        triangle.setSide1(5);
        triangle.setSide2(5);
        triangle.setSide3(5);
        System.out.println("a: " + triangle.getSide1() + ", b: " + triangle.getSide2() + ", c: " + triangle.getSide3());
        System.out.println("area: " + triangle.getArea());
        System.out.println("perimeter" +triangle.getPerimeter());


    }
}
