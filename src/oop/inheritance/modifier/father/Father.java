package oop.inheritance.modifier.father;

public class Father {

    //1.private：只能在当前类中访问
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    //2.缺省：只有当前类中或者同一个包内的类才能访问
    void method(){
        System.out.println("method");
    }

    //3.protected：在当前类中、同一个包内的类、子孙类中都能访问
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    //4.public：在任何地方都能访问
    public void publicMethod(){
        System.out.println("publicMethod");
    }

    /*public static void main(String[] args){
        Father f = new Father();
        f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }*/
}
