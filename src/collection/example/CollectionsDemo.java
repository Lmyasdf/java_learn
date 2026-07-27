package collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        //1.Collections的方法批量加
        Collections.addAll(list,"zhangsan","lisi","wangwu");
        System.out.println(list);

        //2.打乱顺序
        Collections.shuffle(list);
        System.out.println(list);

        //3.排序
        Collections.sort(list,(String a,String b) -> b.length() - a.length());
        System.out.println(list);
    }
}
