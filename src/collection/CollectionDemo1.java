package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //List集合
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(list);
        String s = list.get(0);
        System.out.println(s);

        //Set集合：有序 不重复 无索引
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        System.out.println(set);
    }

}
