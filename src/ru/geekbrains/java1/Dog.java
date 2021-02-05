package ru.geekbrains.java1;

public class Dog extends Animal{

    private final float runLengthMax;
    private final float swimLengthMax;
    private final float jumpHeightMax;

    Dog(String name){
        super(name);
        this.runLengthMax = 500;
        this.swimLengthMax = 10;
        this.jumpHeightMax = 0.5f;
    }

    Dog (String name, float runLengthMax, float swimLengthMax, float jumpHeightMax){
        super(name);
        this.runLengthMax = runLengthMax;
        this.swimLengthMax = swimLengthMax;
        this.jumpHeightMax = jumpHeightMax;

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
