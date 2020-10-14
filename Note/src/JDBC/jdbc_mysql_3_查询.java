package JDBC;

import java.sql.*;

public class jdbc_mysql_3_查询 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/royalhotal?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //1、获得连接对象conn。
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("连接成功！");
            //2、定义要执行的命令。
            String sql = "select * from message where emptype = 1";
            //3、通过连接对象，将命令运输到数据库。
            Statement st = conn.createStatement();
            //4、执行命令。
            ResultSet rs = st.executeQuery(sql);
            //5、从rs结果集对象中获得数据。
            while (rs.next()){  //rs中有数据，则返回true。那么就执行下面的System.out.....
                //可以把表里面的所有属性写在里面。
                System.out.println(rs.getString(3)+" "
                        +rs.getString("empName"));
            }
            /**
             *  rs.getString() 括号里面
             *                 可以写属性名；
             *                 也可以写列的序号（第几列）。
             *  比如：上面的写的是 3 ，那么就是表里面的第三列，对应的属性就是 empPassword。
             */
            //6、关闭资源(对象使用的顺序，倒序)。
            rs.close();
            st.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

