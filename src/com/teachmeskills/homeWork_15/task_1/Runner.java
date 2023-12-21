package com.teachmeskills.homeWork_15.task_1;

/**
 * Objective 1
 * Create a collection of integers and fill it with values entered from the console.
 * When populating a collection with numbers from the console, you should make type casts.
 * The code to convert a string to a number can be used as follows:
 * int i = Integer.parseInt(str);
 * or
 * int val = Integer.valueOf(str);
 * To end your input, enter the word "exit".
 * When converting a string to a number, you should consider the possibility of exceptions.
 * Some useful code examples for casting a string to a number can be found here
 * https://www.geeksforgeeks.org/how-to-convert-a-string-to-an-int-in-java/
 * Display even numbers from the collection on the screen.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer for the collection. Or enter 'exit' to stop entering and check");

        while (true){
            String inputNumber = scanner.next();

            if (inputNumber.equals("exit")){
                break;
            }

            try {
                int i = Integer.parseInt(inputNumber);
                numbers.add(i);
            }
            catch (NumberFormatException e){
                System.out.println("Wrong format. Please enter a integer number or 'exit'");
            }

        }

        System.out.println("\nEven numbers from this collection: ");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }

        }
    }
}
