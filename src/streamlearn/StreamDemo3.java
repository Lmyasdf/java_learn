package streamlearn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream流的方法（返回新流，支持链式编程）
public class StreamDemo3 {
    public static void main(String[] args) {
        //认识Stream流，掌握基本使用步骤
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张强");
        list.add("张三丰");

        //把性张的，名字为三个字的放到新的集合中
        //1.过滤方法filter()
        List<String> newList = list.stream().filter(s -> s.startsWith("张") && s.length() == 3).collect(Collectors.toList());
        System.out.println(newList);

        //2.排序方法sorted()
        List<Double> score = new ArrayList<>();
        score.add(70.6);
        score.add(90.7);
        score.add(80.7);
        score.stream().sorted().forEach(a -> System.out.println(a));//按升序排序
        System.out.println("-----------------");
        score.stream().sorted((s1,s2)->Double.compare(s2,s1)).limit(2).forEach(System.out::println);
        System.out.println("-----------------");
        score.stream().sorted((s1,s2)->Double.compare(s2,s1)).skip(2).forEach(System.out::println);

        //3.加工方法map()
        score.stream().map(s -> s+10).forEach(s -> System.out.println("加十分后" + s));

        //4.合并两个流concat()
        Stream<String> s1 = Stream.of("张三","李四");
        Stream<String> s2 = Stream.of("王五","赵六");
        Stream.concat(s1,s2).forEach(System.out::println);
    }
}
