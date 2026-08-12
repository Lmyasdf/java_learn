package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        // 1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. 获取数据库连接
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        // 3. 定义SQL语句
        String sql = "update emp set age = 30 where id = 1";

        // 4. 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();

        // 5. 执行sql语句
        int rows = stmt.executeUpdate(sql);//受影响的行数

        // 6. 处理结果
        System.out.println(rows);

        // 7. 关闭资源
        stmt.close();
        conn.close();


    }
}
