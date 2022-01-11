package com.company;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	    Dog dog1 = new Dog("Dog1", Breed.Bulldog,3);
	    Dog dog2 = new Dog("Dog2", Breed.Beagle,6);
        Dog dog3 = new Dog("Dog3", Breed.Spaniel,5);

        if (dog1.name.equals(dog2.name)
            || dog1.name.equals(dog3.name)
            || dog2.name.equals(dog3.name)) {
            System.out.println("There are at least 2 dogs with the same name.");
        } else {
            System.out.println("There are no dogs with the same name.");
        }

        TreeSet<Integer> oldestDog = new TreeSet<>();
        oldestDog.add(dog1.age);
        oldestDog.add(dog2.age);
        oldestDog.add(dog3.age);
        if (oldestDog.last().equals(dog1.age))
            System.out.println("The oldest " + dog1);
        if (oldestDog.last().equals(dog2.age))
            System.out.println("The oldest " + dog2);
        if (oldestDog.last().equals(dog3.age))
            System.out.println("The oldest " + dog3);
        System.out.println("Age: " + oldestDog.last() + " years.");

    }
}
