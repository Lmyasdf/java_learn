package max.reflect;

public class Demo1 {
    // 反射的使用

    public static void main(String[] args) throws ClassNotFoundException {
        // 1.通过类来创建类对象
        Class c = Student.class;
        System.out.println(c);

        //2.通过类名来创建类对象
        Class c2 = Class.forName("max.reflect.Student");
        System.out.println(c2 == c);

        //3.通过类的对象来创建类对象
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3 == c2);
        System.out.println(c3 == c);

    }

}
