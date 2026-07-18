package oop.inheritance.override;


public class Test2 {
    public static void main(String[] args){
        Tos t = new Tos("Lmy",18,'男');
        System.out.println(t);
    }
}

class Tos{
    private String name;
    private int age;
    private char sex;

    //重写toString方法，返回对象的属性值而不是地址
    @Override
    public String toString() {
        return this.name + this.age + this.sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Tos(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Tos(){

    }
}
