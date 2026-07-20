package oop.interfacelearn.basics;

public class Test{
    public static void main(String[] args) {
        C c = new C();
        c.run();
        c.write();
    }
}

//用一个类来实现接口，类似于多继承，要重写接口中的抽象方法
//否则要写成抽象类
class C implements A, B {
    @Override
    public void run() {
        System.out.println("C类实现了A接口的run方法");
    }

    @Override
    public void write() {
        System.out.println("C类实现了B接口的write方法");
    }
}
