package oop.enumlearn;

public class Test {
    public static void main(String[] args){
        A a = A.X;//X本质已经是一个对象了
        System.out.println(a);//本质是父类Enum重写了toString()

        //枚举类的两个方法：name()和ordinal()
        System.out.println(a.name());//名称X
        System.out.println(a.ordinal());//索引0
    }
}
