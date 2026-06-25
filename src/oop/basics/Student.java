package oop.basics;

public class Student {
    String name;
    double math;
    double chinese;

    public void printAllScore(){
        System.out.println(name + "的总成绩是" + (math+chinese) );
    }
}
