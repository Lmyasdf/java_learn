package oop.polymorphism.demo;

public class Cat extends Animal {
    private String name = "猫";

    @Override
    public String talk(){
        return "喵喵喵";
    }
    public void run(){
        System.out.println("小猫在跑");
    }
}
