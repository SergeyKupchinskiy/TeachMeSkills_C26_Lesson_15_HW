package com.teachmeskills.homeWork_15.task_2.figure;

public class Circle extends Figure{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateThePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double calculateTheArea() {
        return Math.PI * radius * radius;
    }
}