package oop.inheritance.modifier.father;

public class Test {
    //同包下的类，除了私有成员其他都能调用
    static void main() {
        Father f = new Father();
        //f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
