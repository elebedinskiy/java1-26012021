package ru.geekbrains.java1;

public class Dog extends Animal{

    static final float runLengthMax = 500;
    static final float swimLengthMax = 10;
    static final float jumpHeightMax = 0.5f;

    Dog(String name){
        super(name);
    }

    @Override
    protected void run(float runLength){
        if (runLength <= runLengthMax && runLength != 0){
            System.out.println("Собака " + name + " пробежала расстояние " + runLength);
        }
    }

    @Override
    protected void swim(float swimLength){
        if (swimLength <= swimLengthMax && swimLength != 0){
            System.out.println("Собака " + name + " проплыла расстояние " + swimLength);
        }
    }

    @Override
    protected void jump(float jumpHeight){
        if (jumpHeight <= jumpHeightMax && jumpHeight != 0){
            System.out.println("Собака " + name + " прыгнула в высоту " + jumpHeight);
        }
    }
}
