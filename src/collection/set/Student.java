package collection.set;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//public class Student implements Comparable<Student> {
public class Student {
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + '\n';
    }

    /*@Override
    public int compareTo(Student o) {
        if(this.age == o.age){
            return 1;
        }
        return o.age - this.age;
    }*/
}
