package oop.abstractlearn;

import lombok.Data;

@Data
public abstract class A {
    private String name;
    private int age;
    public abstract void show();

    public A(){
        System.out.println("A的无参构造器");
    }
    //抽象类中不一定要有抽象方法，但是有抽象方法一定是抽象类
    public void show1(){
        System.out.println("A的show1方法");
    }
}
