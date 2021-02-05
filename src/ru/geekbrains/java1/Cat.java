package ru.geekbrains.java1;

public class Cat extends Animal{

    static final float runLengthMax = 200;
    static final float swimLengthMax = 0; // кот не умеет плавать
    static final float jumpHeightMax = 2;

    Cat(String name){
        super(name);
    }

    @Override
    protected void run(float runLength){
        if (runLength <= runLengthMax && runLength != 0){
            System.out.println("Кот " + name + " пробежал расстояние " + runLength);
        }
    }

    @Override
    protected void swim(float swimLength){
        if (swimLength <= swimLengthMax && swimLength != 0){
            System.out.println("Кот " + name + " проплыл расстояние " + swimLength);
        }
    }

    @Override
    protected void jump(float jumpHeight){
        if (jumpHeight <= jumpHeightMax && jumpHeight != 0){
            System.out.println("Кот " + name + " прыгнул в высоту " + jumpHeight);
        }
    }
}
