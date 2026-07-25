package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //Map/HashMap : 无序，不重复，无索引，键值对都可以是null，值无要求
        //LinkedMap: 有序不重复，无索引，null，值无要求
        //TreeMap: 升序不重复，无索引
        Map<String,Integer> m = new HashMap<>();
        m.put("张三",18);
        m.put("李四",19);
        m.put("王五",20);
        m.put("赵六",18);
        System.out.println(m);
    }
}
