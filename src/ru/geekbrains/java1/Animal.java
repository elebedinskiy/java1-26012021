package ru.geekbrains.java1;

abstract public class Animal {

    protected final String name;
    protected float runLength;
    protected float swimLength;
    protected float jumpHeight;

    Animal(String name){
        this.name = name;
    }

    abstract protected void run(float runLength);

    abstract protected void swim(float swimLength);

    abstract protected void jump(float jumpHeight);
}
