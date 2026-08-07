package max.reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

//制作一个简易版框架
//1.定义一个方法可以接受任意对象
//2.每收到一个对象之后获取全部成员变量
//3.把变量名和值写到文件中
public class Demo3 {
    public static void main(String[] args){
        Student s = new Student("张三", 18);
        try {
            //调用getField方法
            getField(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void getField(Object obj) throws Exception {
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();

        try (PrintStream dos = new PrintStream(new FileOutputStream("D:/JavaLearn/src/max/reflect/test.txt"))) {
            for (Field field : fields) {
                field.setAccessible(true);
                String name = field.getName();
                String value = field.get(obj).toString();
                dos.println(name + "=" + value + "\n");
            }
        }
    }
}
