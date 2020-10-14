package JDBC.druid;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 正常不这样配置druid连接池。
 * 而是通过properties文件配置。
 */
public class druid连接池 {
    public static void main(String[] args) {
        DruidDataSource druidDataSource = new DruidDataSource();
        // 在Druid连接池的配置中，driverClassName可配可不配，
        // 如果不配置会根据url自动识别dbType（数据库类型），然后选择相应的driverClassName
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/royalhotal?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("password");
        // 初始化连接数
        druidDataSource.setInitialSize(3);
        // 最小空闲连接数
        druidDataSource.setMinIdle(5);
        // 最大连接数
        druidDataSource.setMaxActive(20);
        // 获取连接时最大等待时间，单位毫秒。
        druidDataSource.setMaxWait(3000);
        try {
            // 获得连接对象
            Connection conn = druidDataSource.getConnection();
            // 显示连接对象
            System.out.println(conn);
            // 还回到数据库连接池中
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

