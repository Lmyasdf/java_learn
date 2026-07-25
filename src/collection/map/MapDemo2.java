package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

//Map的遍历
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("张三",18);
        m.put("李四",19);
        m.put("王五",20);
        m.put("赵六",18);

        //1.遍历键
        Set<String> keys = m.keySet();
        for(String key: keys){
            System.out.println(key + " = " + m.get(key));
        }
        System.out.println("-----------------");

        //2.键值对
        Set<Map.Entry<String,Integer>> s = m.entrySet();
        for(Map.Entry<String,Integer> entry : s){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println("-----------------");

        //3.lambda
        m.forEach(new BiConsumer<String,Integer>(){
            @Override
            public void accept(String key, Integer value){
                System.out.println(key + " = " + value);
            }
        });
        System.out.println("-----------------");

        //可简化为
        m.forEach((key,value) -> System.out.println(key + " = " + value));
    }
}
