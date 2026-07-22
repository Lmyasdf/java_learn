package oop.API;

public class StringDemo {

    public static void main(String[] args) {
        //封装字符串数据

        // 方式1 直接""赋值
        String str = "hello world";
        System.out.println(str);

        // 方式2 使用new关键字创建
        String str2 = new String("hello world");
        System.out.println(str2);

        char[] c = {'h','e','l','l','o'};
        String str3 = new String(c);
        System.out.println(str3);

        //方式一会存储在字符串常量池中，相同的内容只存一份,节约内存
        String str4 = "hello world";
        System.out.println(str == str4);

        //方式二会存储在堆内存中，每个对象都不同
        String str5 = new String("hello world");
        System.out.println(str5 == str2);

        System.out.println("-------------------------");
        //调用字符串的方法
        String s = "hello world";
        //判断字符串是否相等
        System.out.println(s.equals(str));
        //截取字符串，注意不包含结尾索引的字符
        System.out.println(s.substring(2, 7));
    }
}
