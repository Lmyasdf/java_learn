package oop.inheritance.superlearn;

public class People {
    private String name;
    private int age;


    //构造方法
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //无参构造方法
    public People() {
    }

    //getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
