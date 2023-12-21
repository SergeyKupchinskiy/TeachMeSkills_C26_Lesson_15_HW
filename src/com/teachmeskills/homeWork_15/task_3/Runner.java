package com.teachmeskills.homeWork_15.task_3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Objective 3
 * Create a collection of integers.
 * Fill the collection with random numbers.
 * Let the collection size be set from the console.
 * Expect possible errors when retrieving the collection size from the console.
 * Provide a check for validity of the entered collection size.
 * Calculate and display the arithmetic mean of all elements in the collection.
 */

public class Runner {

    public static void main(String[] args) {

        try {

        double sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the collection of numbers: ");

        int sizeCollection = Integer.parseInt(scanner.nextLine());
        List<Integer> numberCollection = new ArrayList<>(sizeCollection);

        for (int i = 0; i < sizeCollection; i++) {
            numberCollection.add((int) (Math.random() * 100));
            sum += numberCollection.get(i);
        }

        double average = sum / sizeCollection;

        System.out.println("Your random number collection: \n" + numberCollection);
        System.out.println("Average of this number collection: \n" + average);
        }
        catch (NumberFormatException e){
            System.out.println("input cannot be converted to number");
        }
        catch (InputMismatchException e){
            System.out.println("Input mismatch for collection size");
        }

    }
}


