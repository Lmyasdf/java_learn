package collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        //HashSet:无序、不重复、无索引
        //LinkedSet:有序、不重复、无索引
        //TreeSet:排序、不重复、有索引
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("i");
        set.add("k");
        set.add("a");
        set.add("c");
        set.add("b");
        System.out.println(set);
        set.remove("b");
        System.out.println(set);
    }
}
