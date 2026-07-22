package oop.API;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args){
        //初始化
        ArrayList<String> list = new ArrayList<>();//泛型定义集合
        list.add("hello");
        list.add("hi");
        list.add("java");

        //输出
        System.out.println(list.get(1));

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        };

        //删除
        System.out.println(list.remove("hi"));
        System.out.println(list);

        //修改数据
        list.set(1,"change");
        System.out.println(list);

    }
}
