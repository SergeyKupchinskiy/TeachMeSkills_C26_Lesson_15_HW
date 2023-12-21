package com.teachmeskills.homeWork_15.task_6;

/**
 * Objective 6
 * Create a collection of unique names of all students in our group + teacher.
 * Display the collection on the screen.
 */

import java.util.HashSet;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {

        Set<String> name = new HashSet<>();

        name.add("Andrew");
        name.add("Sergey");
        name.add("Arthur");
        name.add("Dmitriy");
        name.add("Fedor");
        name.add("Elisaveta");
        name.add("Polina");
        name.add("Ivan");
        name.add("Daniil");
        name.add("Stepan");
        name.add("Mark");

        System.out.println(name);

    }
}
