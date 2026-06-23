package oop;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.math = 90;
        s1.chinese = 80;
        System.out.println(s1.name + "的总成绩是" + (s1.math+s1.chinese) );

    }
}
