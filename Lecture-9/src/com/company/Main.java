package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Dog dog1 = new Dog("Dog1", Breed.Bulldog,5);
	    Dog dog2 = new Dog("Dog2", Breed.Beagle,5);
        Dog dog3 = new Dog("Dog3", Breed.Spaniel,5);

        if (dog1.name.equals(dog2.name)
            || dog1.name.equals(dog3.name)
            || dog2.name.equals(dog3.name)) {
            System.out.println("There are at least 2 dogs with the same name");
        } else {
            System.out.println("There are no dogs with the same name");
        }

        ArrayList<Dog> oldestDogs = new ArrayList<>();
        oldestDogs.add(dog1);
        if(oldestDogs.get(0).age < dog2.age) {
            oldestDogs.clear();
            oldestDogs.add(dog2);
        } else if(oldestDogs.get(0).age == dog2.age) {
            oldestDogs.add(dog2);
        }
        if(oldestDogs.get(0).age < dog3.age) {
            oldestDogs.clear();
            oldestDogs.add(dog3);
        } else if(oldestDogs.get(0).age == dog3.age) {
            oldestDogs.add(dog3);
        }

        System.out.println(oldestDogs);
    }
}
