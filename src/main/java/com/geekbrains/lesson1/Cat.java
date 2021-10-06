package com.geekbrains.lesson1;

public class Cat {

    // Поля описывают св-ва
    private String name;
    private String color;
//    private int age;
    static int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Методы описывают поведение
    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void meow() {
        System.out.println(name + " meow");
    }
}
