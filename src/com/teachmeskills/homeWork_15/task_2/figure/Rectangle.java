package com.teachmeskills.homeWork_15.task_2.figure;

public class Rectangle extends Figure{
    public double side1;
    public double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateThePerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    double calculateTheArea() {
        return side1 * side2;
    }
}