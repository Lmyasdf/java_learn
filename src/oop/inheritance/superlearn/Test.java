package oop.inheritance.superlearn;

public class Test {
/*  super的使用场景：当创建子类对象时，且父类存在对象的属性值，需要有参构造器初始化所有属性时，
    子类构造器负责初始化子类属性的同时加上super来调用父类的有参构造器，实现对父类属性的初始化。*/
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Lmy",18,"数学");
        System.out.println(teacher);
    }
}
