package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_mysql_2_修改 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/royalhotal?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            /** 1、获得连接对象conn。*/
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("连接成功！");
            /** 2、定义要执行的命令。*/
            // 增
            String sql = "insert into message values(3, '141', '333', '韩天琪', 3)";
            // 删
//            String sql = "delete from message where emptype = 3";
            // 改
//            String sql ="update message set empAccount = '171'where emptype = 4";
            /** 3、通过连接对象，将命令运输到数据库。*/
            Statement st = conn.createStatement();
            /** 4、执行命令。*/
            st.execute(sql);
            System.out.println("操作成功！");
            /** 5、关闭资源(对象使用的顺序，倒序)。*/
            st.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

