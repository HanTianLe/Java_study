package JDBC;

import JDBC.tools.DB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc_mysql_5_更新 extends DB{
    /** 修改 */
    public void modify() {
        String sql = "update message set emptype = ? where empId = ?"; //利用占位符。
        //获得连接对象 conn
        getConn();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,1);
            ps.setInt(2,5);
            //增删改
            ps.executeUpdate();
            System.out.println("修改成功！");
            //关闭资源(对象使用的顺序，倒序)。
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new jdbc_mysql_5_更新().modify();
    }
}

