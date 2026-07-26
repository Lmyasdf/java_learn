package streamlearn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        //认识Stream流，掌握基本使用步骤
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");
        list.add("张强");
        list.add("张三丰");

        //把性张的，名字为三个字的放到新的集合中

        List<String> newList = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).collect(Collectors.toList());
        System.out.println(newList);
    }
}
