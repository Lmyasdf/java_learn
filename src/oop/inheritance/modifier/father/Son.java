package oop.inheritance.modifier.father;

public class Son extends Father {
    public void test(){
        method();
        protectedMethod();
        publicMethod();
    }

    static void main() {
        Son s = new Son();
        s.test();
    }
}
