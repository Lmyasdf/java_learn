package oop;

//工具类可以用final修饰，防止被继承，确保工具类的静态方法不能被重写
public class final_leran {
    public static void main(String[] args){
        // 1.final修饰局部变量，不能再次赋值，只能在定义时赋值一次
        final int a = 10;
        //a = 20;

        //实例变量改不了
        C c = new C();
        //c.age = 20;

        //静态变量改不了
        //C.SCHOOL_NAME = "北京大学";

        //6.final修饰数组，数组地址不能修改，存储的元素可以
        final int[] arr = {1,2,3};
        //arr = new int[]{4,5,6};
        arr[0] = 100;
        System.out.println(arr[0]);

    }

}

//2. final修饰类，类不能再被继承
final class A{

}
//class B extends A{
//}

class C{
    // 3. final修饰方法，方法不能再被重写
    public final void method(){
        System.out.println("method");
    }

    // 4.final修饰静态变量（常量）
    public static final String SCHOOL_NAME = "清华大学";

    //5. final修饰实例变量（无意义）
    public final int age = 18;
}

class D extends C{
    /*不能再重写final修饰的方法
    @Override
    public void method(){
        System.out.println("重写method");
    }
    */
}


