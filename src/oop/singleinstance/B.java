package oop.singleinstance;
//懒汉式单例（对象等用的时候再创建）
public class B {
    //1. 私有化构造器
    private B(){}
    //2. 单例对象（注意私有且静态）
    private static B b;
    //3. 提供公共方法获取单例对象
    public static B getInstance(){
        if(b == null){
            b = new B();
        }
        return b;
    }
}
