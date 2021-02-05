package ru.geekbrains.java1;

public class Hello {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Шарик");

        Cat cat2 = new Cat("Мурзик", 250, 0.5f, 2.5f);
        Dog dog2 = new Dog("Тузик", 600, 12, 1.5f);

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

        cat2.run(245);
        cat2.run(275);
        cat2.swim(0.1f);
        cat2.swim(2);
        cat2.jump(2.2f);
        cat2.jump(2.8f);

        dog2.run(590);
        dog2.run(610);
        dog2.swim(10);
        dog2.swim(14);
        dog2.jump(0.8f);
        dog2.jump(1.8f);
    }
}
