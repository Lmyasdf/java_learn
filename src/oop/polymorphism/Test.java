package oop.polymorphism;

public class Test {
    public static void main(String[] args) {
        // 多态
        // 父类引用指向子类对象

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // 调用的是子类的方法（编译看左边，运行看右边）
        System.out.println(a1.talk());
        System.out.println(a2.talk());

        // 成员属性没有多态性
        System.out.println(a1.name);
        System.out.println(a2.name);
    }
}
