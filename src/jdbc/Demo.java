package jdbc;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo {
    @Test
    public void testSelectAll() throws Exception {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        Connection conn = DriverManager.getConnection(url, "root", "123456");

        PreparedStatement ps = conn.prepareStatement("select * from emp");
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("age"));
        }

        rs.close();
        ps.close();
        conn.close();
    }
}
