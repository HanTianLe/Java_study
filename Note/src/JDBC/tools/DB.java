package JDBC.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    public Connection conn = null;

    String url = "jdbc:mysql://localhost:3306/royalhotal?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8";
    String user = "root";
    String password = "password";

    /**
     * 获得数据库连接对象。conn
     */
    public void getConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //1、获得连接对象conn。
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}

