package com.teachmeskills.homeWork_15.task_2;

import com.teachmeskills.homeWork_15.task_2.figure.Circle;
import com.teachmeskills.homeWork_15.task_2.figure.Figure;
import com.teachmeskills.homeWork_15.task_2.figure.Rectangle;
import com.teachmeskills.homeWork_15.task_2.figure.Triangle;

import java.util.ArrayList;

/**
 * Objective 2
 * Create a collection of shapes.
 * (The classes for the shapes can be taken from previous homework assignments. It is not necessary to use sealed classes)
 * Fill the collection with various shapes.
 * Loop through the collection and call a method to calculate and display the perimeter of each shape.
 */

public class Runner {

    public static void main(String[] args) {

        ArrayList<Figure> figures = new ArrayList<>();

        figures.add(new Triangle(3,4,5));
        figures.add(new Rectangle(6,7));
        figures.add(new Circle(9));

        for (Figure i : figures){
            System.out.println("The perimeter of the figure = " + i.calculateThePerimeter());
        }
    }
}
