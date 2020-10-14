package JDBC.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 *  正规的是通过properties文件的方式，我们再src下面创建了druid-config.properties文件。
 *  (properties文件名字随便)
 *  来配置连接池。
 */
public class druid连接池2 {
    public static void main(String[] args) {
        // 数据源
        DataSource ds = null;
        Properties pp = new Properties();
        try {
            pp.load(new FileInputStream("src/druid-config.properties"));
            ds= DruidDataSourceFactory.createDataSource(pp);
            // 获得连接对象
            Connection conn = ds.getConnection();
            // 显示连接对象
            System.out.println(conn);
            // 还回到数据库连接池中
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

