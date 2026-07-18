package oop.inheritance.override;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.test();
    }
}

class Animal{
    public void test(){
        System.out.println("Animal test");
    }
}

class Dog extends Animal{
    @Override //方法重写的校验标志：要求方法名称和形参列表与重写方法完全一致，否则会报错
    //子类重写父类方法时，要求子类方法的权限不能低于父类方法的权限（返回类型同理）
    //私有和静态方法不能重写

    //重写的规范：声明不变，重新实现
    public void test(){
        System.out.println("Dog test");
    }
}
