package max.reflect;

public class Student {
    private String name;
    private int age;

    public Student() {}
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Student(String name){

        this.name = name;
    }

    public void study(){
        System.out.println("我在学习");
    }
    private void sleep(){
        System.out.println("我在睡觉");
    }

    private void sleep(int hour){
        System.out.println("我在睡觉" + hour + "小时");
    }

    public String toString(){
        return "我是" + name + "，我今年" + age + "岁";
    }
}
