package ru.geekbrains.java1;

public class Cat{
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate fromPlate){
        if (fromPlate.getFood() >= appetite && !getSatiety()){
            fromPlate.decrease(appetite);
            this.satiety = true;
        } else if (getSatiety()){
            System.out.println("Кошечка сыта, кушать не хочет");
        }
        else {
            System.out.println("В тарелке не хватило еды для кошечки");
        }
    }

    public boolean getSatiety(){
        return satiety;
    }

}
