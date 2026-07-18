package oop.polymorphism.demo;

public class Dog extends Animal {
    private String name = "狗";

    @Override
    public String talk(){
        return "汪汪汪";
    }
}
