package max.annotation;

import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

//解析注解：判断类/字段/方法上面是否有注解，然后获取注解属性值
public class ParseClass {
    public static void main(String[] args) {
        //1.类的注解
        Class c = MyAnnotation.class;
        //使用isAnnotationPresent判断这个类上是否有A注解
        if(c.isAnnotationPresent(A.class)){
            //使用getDeclaredAnnotation获取A注解对象
            A a = (A)c.getDeclaredAnnotation(A.class);
            //获取并打印注解属性值
            String[] address = a.address();
            String name = a.name();
            System.out.println(name);
            System.out.println(Arrays.toString(address));
        }

    }

    @Test
    public void ParseField(){
        try{
            Class c = MyAnnotation.class;
            Field f = c.getDeclaredField("name");
            if(f.isAnnotationPresent(A.class)){
                //获取注解对象
                A a = f.getDeclaredAnnotation(A.class);
                f.setAccessible(true);
                //获取并打印注解属性值
                String name = a.name();
                String[] address = a.address();
                System.out.println(name);
                System.out.println(Arrays.toString(address));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
