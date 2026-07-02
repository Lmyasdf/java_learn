package oop.inheritance.modifier.test;

import oop.inheritance.modifier.father.Father;

public class Test {
    public static void main(String[] args) {
        Father f = new Father();
        /*
        f.privateMethod();
        f.method();
        f.protectedMethod();
        */
        f.publicMethod();
    }
}
