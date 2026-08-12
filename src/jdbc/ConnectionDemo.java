package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionDemo {
    static void main(String[] args) throws Exception {
        //连接数据库
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "java";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement s = conn.createStatement();

        //定义sql语句
        String sql1 = "update emp set age = 20 where id = 1";
        String sql2 = "update emp set age = 21 where id = 2";

        //事务管理
        try {
            //开启事务
            conn.setAutoCommit(false);
            //执行sql语句
            int rows1 = s.executeUpdate(sql1);
            System.out.println(rows1);

            //模拟异常
            int i = 10 / 0;

            int rows2 = s.executeUpdate(sql2);
            System.out.println(rows2);

            //提交事务
            conn.commit();
        }catch (Exception e){
            //回滚事务
            conn.rollback();
            e.printStackTrace();
        }

    }
}
