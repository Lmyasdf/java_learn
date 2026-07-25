package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        //基本功能
        list.add("张三");
        list.add("李四");
        System.out.println(list);
        list.add(2,"王五");
        System.out.println(list);
        System.out.println(list.remove(list.get(0)));
        System.out.println(list);

        //for循环
        System.out.println("for循环：");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //迭代器
        System.out.println("迭代器遍历：");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //增强for
        System.out.println("增强for:");
        for(String name: list){
            System.out.println(name);
        }

        //lambda表达式
        System.out.println("lambda表达式");
        list.forEach(System.out::println);
    }
}
