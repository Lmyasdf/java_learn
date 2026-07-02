package oop.inheritance.modifier.test;

import oop.inheritance.modifier.father.Father;

public class SonTest extends Father {
    public void test(){
        //privateMethod();
        //method();
        protectedMethod();
        publicMethod();
    }
    static void main() {
        SonTest st = new SonTest();
        st.test();

    }
}
