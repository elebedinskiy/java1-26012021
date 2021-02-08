package ru.geekbrains.java1;

public class Plate {
    private int food;

    Plate(int food){
        this.food = food;
    }

    public void info(){
        System.out.println("В тарелке еды: " + food);
    }

    public void decrease(int appetite){
        if (appetite <= food){
            this.food -= appetite;
        }
    }

    public int getFood(){
        return food;
    }

    public void addFood (int food){
        this.food += food;
    }
}
