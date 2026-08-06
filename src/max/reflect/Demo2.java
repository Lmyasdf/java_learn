package max.reflect;

import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获取类的信息
public class Demo2 {
    static void main(String[] args) {
        Class c = Student.class;
        System.out.println(c.getName());//获取全类名
        System.out.println(c.getSimpleName());//获取类名


    }


    //获取构造方法
    @Test
    public void getConstructor() throws Exception{
        Class c1 = Student.class;
        //获取所有public构造方法
        Constructor[] constructors1 =  c1.getConstructors();
        for (Constructor constructor : constructors1) {
            System.out.println(constructor);
        }

        //获取所有构造方法
        Constructor[] constructors2 =  c1.getDeclaredConstructors();
        for (Constructor constructor : constructors2) {
            System.out.println(constructor);
        }

        System.out.println(c1.getDeclaredConstructor(String.class));

        //获取构造器的作用：创建对象
        //暴力反射 可以访问私有构造方法
        Constructor con = c1.getDeclaredConstructor(String.class);
        con.setAccessible(true);
        Student s = (Student) con.newInstance("张三");
        System.out.println(s);

    }

    //获取类的成员变量并操作
    @Test
    public void getField() throws Exception{
        Class c1 = Student.class;
        //1.获取成员变量
        //获取所有成员变量
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //获取单个成员变量
        Field field = c1.getDeclaredField("age");
        System.out.println(field);

        //2.操作成员变量
        //设置访问权限
        field.setAccessible(true);
        //获取成员变量的值
        Student s = new Student();
        int age = field.getInt(s);
        System.out.println(age);
        //设置成员变量的值
        field.setInt(s, 18);
        //获取成员变量的值
        age = field.getInt(s);
        System.out.println(age);
    }

    //3.获取方法变量
    @Test
    public void getMethod() throws Exception{
        Class c1 = Student.class;
        //获取所有方法
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        //获取单个方法
        Method method = c1.getDeclaredMethod("sleep");
        System.out.println(method);
        Method method2 = c1.getDeclaredMethod("sleep", int.class);
        System.out.println(method2);

        //调用方法
        Student s = new Student();
        Method m = c1.getDeclaredMethod("sleep");
        method2.setAccessible(true);
        m.setAccessible(true);
        m.invoke(s);
        method2.invoke(s, 8);

    }


}


