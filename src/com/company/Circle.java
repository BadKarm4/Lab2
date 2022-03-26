package com.company;

public class Circle extends Shape {
    private Double radius;
    public Circle(Double radius) {this.radius = radius;}
    public Double calculatePerimeter() {return 2 * 3.14 * radius;}
    public Double calculateArea() {return 3.14 * radius * radius;}
}
