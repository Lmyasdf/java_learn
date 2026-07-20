package oop.abstractlearn;

//子类继承抽象类必须重写抽象方法，否则也要变成抽象类
public class B extends A{
    @Override
    public void show() {
        System.out.println("B重写A的show方法");
    }
}
