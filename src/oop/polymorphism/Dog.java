package oop.polymorphism;

public class Dog extends Animal {
    private String name = "狗";

    @Override
    public String talk(){
        return "汪汪汪";
    }

    public void run(){
        System.out.println("小狗在跑");
    }
}
