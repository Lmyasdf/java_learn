package oop.lambda;
//注意：lambda只能应用于函数式接口的匿名内部类
public class LambdaDemo {
    public static void main(String[] args){
        //lambda表达式如下：重写函数的形参列表 -> {函数实现} + ;
        //简化方式： 参数类型可以不写，只有一行时大括号和分号可以省略
        //只有一个参数时（）可以省略，一行时return可以省略

        //1.原始匿名内部类方式
//        swim s = new swim(){
//            @Override
//            public String swimming(){
//                return "游泳";
//            }
//        };

        //2.lambda表达式方式
//        swim s = () -> {
//            return "游泳";
//        };

        //3.lambda表达式简化方式
        swim s = () -> "游泳";
        System.out.println(s.swimming());
    }

}

@FunctionalInterface //判断是否是函数式接口
interface swim{
    String swimming();
}
