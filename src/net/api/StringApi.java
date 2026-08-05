package net.api;

public class StringApi {
    static void main(String[] args) {
        //高效拼接字符串
        //始终只在一个对象内操作，不像+那样每次都要创建一个新的对象
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world");
        System.out.println(sb);
        //将StringBuilder转换为String
        String str = sb.toString();
        System.out.println(str);
    }
}
