package com.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {

//        Cat cat = new Cat();
//        cat.name = "Barsik";
//        cat.color = "White";
//        cat.age = 2;
//        cat.info();
//        Cat cat2 = new Cat();
//        cat2.name = "Murzik";
//        cat2.color = "Black";
//        cat2.age = 4;
//        cat2.info();

        Cat cat = new Cat("Barsik", "White", 2);
        cat.info();

        Cat cat2 = new Cat("Murzik", "Black", 4);
        cat2.info();

    }
}
