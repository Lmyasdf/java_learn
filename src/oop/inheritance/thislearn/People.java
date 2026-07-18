package oop.inheritance.thislearn;

public class People {
    private String name;
    private int age;
    private String skill;

    public People(String name,int age) {
        this(name,age,"数学");//this可以在少参构造器中调用有参构造器，并把少的参数赋值
    }

    //有参构造器
    public People(String name, int age, String skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    //无参构造器
    public People() {

    }

    //提供get和set方法
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    //重写一下toString方法
    @Override
    public String toString() {
        return "People{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", skill='" + getSkill() + '\'' +
                '}';
    }
}
