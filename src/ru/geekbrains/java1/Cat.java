package ru.geekbrains.java1;

public class Cat extends Animal{

    private final float runLengthMax;
    private final float swimLengthMax;
    private final float jumpHeightMax;

    Cat(String name){
        super(name);
        this.runLengthMax = 200;
        this.swimLengthMax = 0; // кот не умеет плавать
        this.jumpHeightMax = 2;
    }

    Cat (String name, float runLengthMax, float swimLengthMax, float jumpHeightMax){
        super(name);
        this.runLengthMax = runLengthMax;
        this.swimLengthMax = swimLengthMax;
        this.jumpHeightMax = jumpHeightMax;

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
