package JDBC.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class c3p0连接池2 {
    public static void main(String[] args) {
        /**
         *  正规的是通过xml文件的方式，我们再src下面创建了c3p0-config.xml文件。(xml文件名字必须是这样！不能改)
         *  来配置连接池。
         */
        try {
            /** 创建C3P0  */
            // 这边的configName是c3p0-config.xml文件里面的
            // <named-config name="test_c3p0">标签里面的name属性值。
            ComboPooledDataSource dataSource = new ComboPooledDataSource("test_c3p0");
            // 获得连接对象
            Connection connection = dataSource.getConnection();
            // 显示连接对象
            System.out.println(connection);
            /** 还回到数据库连接池中 */
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

