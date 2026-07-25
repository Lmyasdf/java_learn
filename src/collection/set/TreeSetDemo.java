package collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //自定义比较器 按照年龄降序
        TreeSet<Student> s = new TreeSet<>((o1, o2) ->{
                if(o1.getAge() == o2.getAge())return 1;
                return o2.getAge() - o1.getAge();
            }
        );
        s.add(new Student("张三", 18, 10000));
        s.add(new Student("李四", 19, 15000));
        s.add(new Student("王五", 20, 20000));
        s.add(new Student("赵六", 18, 25000));
        System.out.println(s);

    }
}
