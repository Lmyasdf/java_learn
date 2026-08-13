package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//PreparedStatement示例
public class PreparedStatementDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        // 2. 定义SQL语句
        String sql = "select * from emp where id = ? and name = ?";
        // 3. 获取执行sql的对象 PreparedStatement
        PreparedStatement ps = conn.prepareStatement(sql);
        // 4. 设置参数
        ps.setInt(1,1);
        ps.setString(2,"张三");

        // 5. 执行sql语句
        ResultSet rs = ps.executeQuery();
        // 6. 处理结果
        if(rs.next()){
            System.out.println("id = " + rs.getInt("id"));
            System.out.println("name = " + rs.getString("name"));
            System.out.println("age = " + rs.getInt("age"));
        }
        // 7. 关闭资源
        rs.close();
        ps.close();
        conn.close();
    }
}
