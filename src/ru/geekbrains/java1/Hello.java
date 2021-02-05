package ru.geekbrains.java1;

public class Hello {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Шарик");

        cat1.run(190);
        cat1.run(210);
        cat1.swim(1);
        cat1.swim(2);
        cat1.jump(1.5f);
        cat1.jump(2.5f);

        dog1.run(490);
        dog1.run(510);
        dog1.swim(8);
        dog1.swim(12);
        dog1.jump(0.5f);
        dog1.jump(1);
    }
}
