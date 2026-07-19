package oop.singleinstance;
//饿汉式单例
public class A {
    //1. 私有化构造器
    private A(){}
    //2. 创建单例对象（注意私有且静态）
    private static A a = new A();
    //3. 提供公共方法获取单例对象
    public static A getInstance(){
        return a;
    }
}
