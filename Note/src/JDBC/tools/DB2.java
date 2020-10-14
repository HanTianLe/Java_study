package JDBC.tools;

import java.sql.*;

public class DB2 {

    static String url = "jdbc:mysql://localhost:3306/royalhotal?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8";
    static String user = "root";
    static String password = "password";

    /** 3个操作对象。*/
    protected Connection conn = null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;

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

    /**
     * 关闭资源。
     */
    public void close(){
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

