package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ResultSetDemo {
    public static void main(String[] args) throws Exception {
        //连接数据库
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "java";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement s = conn.createStatement();

        //执行sql语句
        String sql = "select * from emp";
        //执行sql语句
        ResultSet rs = s.executeQuery(sql);

        //员工对象集合
        ArrayList<Employee> employees = new ArrayList<>();
        for(int i=1;i<=3;i++){
            rs.next();
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(4);
            Employee emp = new Employee(id,name,age);
            employees.add(emp);
        }

        //遍历员工对象集合并输出员工信息
        for(Employee emp : employees){
            //System.out.println(emp);
            System.out.println(emp.id + " " + emp.name + " " + emp.age);
        }

        //关闭资源
        rs.close();
        s.close();
        conn.close();
    }

    public static class Employee{
        int id;
        String name;
        int age;

        public Employee(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }


}
