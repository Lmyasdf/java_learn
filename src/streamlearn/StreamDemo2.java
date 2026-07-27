package streamlearn;

import java.util.*;
import java.util.stream.Stream;
//获取Stream流的方式
public class StreamDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        //1.通过Collection集合获取Stream流，直接调用stream()方法
        Stream<String> s1 = list.stream();

        //2.获取Map的流
        Map<String,Integer> map = new HashMap<>();
        //键流
        Stream<String> s2 = map.keySet().stream();
        //值流
        Stream<Integer> s3 = map.values().stream();
        //键值对流
        Stream<Map.Entry<String,Integer>> s4 = map.entrySet().stream();

        //3.获取数组的流
        String[] arr = {"张三","李四","王五","赵六"};
        Stream<String> s5 = Arrays.stream(arr);
        System.out.println(s5.count());

        Stream<String> s6 = Stream.of(arr);

        int[] arr2 = {1,2,3,4,5};
        Stream<Integer> s7 = Arrays.stream(arr2).boxed();//box把int改成Integer
        System.out.println(s7.count());
    }
}
