package pl.wsb;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(args);

        Date d = new Date();
        System.out.println(d.toString());

        Animal animal1 = new Animal("Corn snake", 0.9);
        Animal animal2 = new Animal("Ball python", 1.4);

        Human human1 = new Human("Adam", "Kowalski", 26);
        Human human2 = new Human ("Zofia", "Nowak", 66);

        Phone phone1 = new Phone("Samsung", "Galaxy S10", 6.1, 0.157);
        Phone phone2 = new Phone("Samsung", "Galaxy S20", 6.2, 0.163);

        System.out.println(animal2.name);

    }
}