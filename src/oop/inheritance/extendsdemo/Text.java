package oop.inheritance.extendsdemo;

public class Text {
    public static void main(String[] args){
        //子类对象是由子类和父类共同创建出来的
        //子类可以继承父类的非private属性和方法
        Teacher t = new Teacher();
        t.setName("张三");
        t.setSex('男');
        t.setSkill("教学");
        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSkill());
    }
}
