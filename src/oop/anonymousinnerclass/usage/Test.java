package oop.anonymousinnerclass.usage;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student("张三", 18, 90);
        s[1] = new Student("李四", 19, 85);
        s[2] = new Student("王五", 20, 95);
        s[3] = new Student("赵六", 21, 88);
        s[4] = new Student("王二", 22, 92);
        System.out.println("排序前:");
        for (Student student : s) {
            System.out.println(student);
        }
        System.out.println("排序后:");

        //*使用场景*：可以应用到API中的接口，避免创建新的类，直接在方法中实现接口，把对象传输给方法
        //当使用别人的功能时需要我们实现接口传入方法，可以直接在方法中实现接口即可
        //当这个接口的实现只需要使用一次时，匿名内部类是最佳选择；如果多次使用，还是应该单独定义一个类。
        Arrays.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore();
            }
        });
        for (Student student : s) {
            System.out.println(student);
        }

    }

}
