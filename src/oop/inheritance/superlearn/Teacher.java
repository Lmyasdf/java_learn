package oop.inheritance.superlearn;

public class Teacher extends People {
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill){
        this.skill = skill;
    }

    //有参无参构造器不写返回类型
    public Teacher(String name,int age,String skill){
        //使用super调用父类的有参构造器，实现在子类这里也能对父类含有的属性进行初始化
        super(name,age);
        setSkill(skill);
    }

    public Teacher(){

    }

    //重写一下toString方法
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", skill='" + getSkill() + '\'' +
                '}';
    }
}
