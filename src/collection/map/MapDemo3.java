package collection.map;

import java.util.*;
//随机投票统计
public class MapDemo3 {
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        String[] arr = {"拉萨","成都","北京","上海"};
        Random r = new Random();
        for(int i=1;i<=80;i++){
            int index = r.nextInt(arr.length);
            l.add(arr[index]);
        }
        Map<String,Integer> m = new HashMap<>();
        for(String s : l){
            m.put(s,m.containsKey(s) ? m.get(s)+1 : 1);
        }

        m.forEach((key,value)-> System.out.println(key + "被选择了" + value + "次"));
        System.out.println("-----------------");

        for(String s:m.keySet()){
            System.out.println(s + "被选择了" + m.get(s) + "次");
        }
        System.out.println("-----------------");

        for(Map.Entry<String,Integer> entry : m.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "被选择了" + value + "次");
        }
    }
}
