package JDBC.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class c3p0连接池 {
    public static void main(String[] args) {
        /**
         * 正常情况下，我们不这样写。
         * 而是通过xml文件的方式。
         */
        try {
            // 创建C3P0 连接池
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/royalhotal?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8");
            dataSource.setUser("root");
            dataSource.setPassword("password");
            // 初始化连接池的大小(设置初始化连接个数)
            dataSource.setInitialPoolSize(20);
            // 设置最小连接数(空闲时候)
            dataSource.setMinPoolSize(2);
            // 设置最大连接数
            dataSource.setMaxPoolSize(40);
            // 当连接对象不够时，再次申请的连接对象个数。
            dataSource.setAcquireIncrement(5);
            // 获得连接对象
            Connection connection = dataSource.getConnection();
            // 显示连接对象
            System.out.println(connection);
            // 还回到数据库连接池中
            connection.close();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

