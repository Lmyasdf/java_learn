package oop.anonymousinnerclass;
//匿名内部类
//本质是一个子类，并会立即创建一个对象，用于调用子类的方法
//好处：可以避免创建一个类，用于实现接口，可以更方便的创建对象
public class Test {
    public static void main(String[] args) {
        swim s = new swim(){
            @Override
            public void swimming() {
                System.out.println("游泳");
            }
        };
        start(s);
    }
    public static void start(swim s){
        System.out.println("开始");
        s.swimming();
        System.out.println("结束");
    }
}

interface swim{
    void swimming();
}
