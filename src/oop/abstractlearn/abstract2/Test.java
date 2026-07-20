package oop.abstractlearn.abstract2;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.cry();
        a = new Dog();
        a.cry();
    }

}
