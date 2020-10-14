package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_mysql_1_连接 {
    public static void main(String[] args) {

        try {
            /** 1、加载数据库的驱动。(参数是驱动类路径)*/
            Class.forName("com.mysql.cj.jdbc.Driver");

            /** 2、获得连接对象。
             *     格式：jdbc:mysql://localhost:3306/数据库名称。
             *     后面的 ?serverTimezone=UTC 是统一标准世界时间。
             */
            String url = "jdbc:mysql://localhost:3306/royalhotal?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(url,"root","password");
            //if()里面也可以写：!con.isClosed()
            if(conn != null) {
                System.out.println("mysql连接成功！");
            }
        } catch(ClassNotFoundException e) {
            //数据库驱动类异常处理。
            System.out.println("对不起，连接失败!");
            e.printStackTrace();
        } catch(SQLException e) {
            //数据库连接失败异常处理。
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

