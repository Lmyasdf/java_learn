package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTraversalDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("S");

        //1.迭代器遍历(推荐，不用管索引问题，可增删，另外的遍历用)
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //2.for遍历
        for(String s : list) {
            System.out.println(s);
        }

        //3.Lambda表达式遍历
        //list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
