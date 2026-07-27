package streamlearn;

import java.util.*;
import java.util.stream.Collectors;

//终结方法
public class StreamDemo4 {
     public static void main(String[] args) {
          //forEach
          List<String> list = new ArrayList<>();
          list.add("张三");
          list.add("李四");
          list.add("王五");
          list.add("赵六666");
          list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);

          //count()
          long count = list.stream().filter(s -> s.startsWith("张")).count();
          System.out.println(count);

          //max/min 要给出比较规则
         Optional<String> max = list.stream().max(Comparator.comparing(String::length));
         String s = max.get();
         System.out.println(s);

         //收集collect
         List<String> list2 = list.stream().collect(Collectors.toList());
         System.out.println(list2);

         //toArray
         String[] arr = list.stream().toArray(String[]::new);
         System.out.println(Arrays.toString(arr));
     }
}
