package oop.abstractlearn.abstract3;
//抽象类的使用场景：设计模板方法
//模板方法：在抽象类中定义一个方法，该方法的实现由子类继承实现，但是该方法的调用顺序是固定的
public abstract class People {
    public void write(){
        System.out.println("标题");
        System.out.println("第一段");
        wirteContent();
        System.out.println("结尾");
    }

    public abstract void wirteContent();
}
