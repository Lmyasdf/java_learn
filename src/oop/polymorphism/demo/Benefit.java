package oop.polymorphism.demo;

public class Benefit {
    //多态的好处：

    public void main(String[] args) {
        // 1.解耦合
        Animal a = new Dog();//dog可以换成cat等等，后面代码不需要修改
        System.out.println(a.talk()+'\n');
        //a.run(); 报错，多态不能调用子类的独有方法

        Animal b = new Cat();
        test(b);
        test(a);

    }
    //2.父类类型变量作为参数可以接受任意子类对象
    public void test(Animal a){
        System.out.println(a.talk());
        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.run();
        }
        else if(a instanceof Cat){
            Cat c = (Cat)a;
            c.run();
        }
    }
}
