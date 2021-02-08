package ru.geekbrains.java1;

public class Hello {
    public static void main(String[] args) {
        // ...
        Cat cat1 = new Cat("Барсик", 5);
        Cat cat2 = new Cat("Мурзик", 7);
        Cat cat3 = new Cat("Пушок", 10);

        Plate plate1 = new Plate(20);
        plate1.info();

        Cat[] cats = { cat1, cat2, cat3};
        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate1);
            System.out.println(cats[i].getSatiety());
            plate1.info();
        }

        plate1.addFood(30);

        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate1);
            System.out.println(cats[i].getSatiety());
            plate1.info();
        }

        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate1);
            System.out.println(cats[i].getSatiety());
            plate1.info();
        }
    }
}
