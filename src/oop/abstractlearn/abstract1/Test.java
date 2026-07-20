package oop.abstractlearn.abstract1;

public class Test {
    public static void main(String[] args) {
        //抽象类不能有对象
        //A a = new A();
        B a = new B();
        a.show1();
        a.setName("张三");
        System.out.println(a.getName());
    }
}
