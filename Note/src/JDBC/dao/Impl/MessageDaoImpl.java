package JDBC.dao.Impl;

import JDBC.dao.MessageDao;
import JDBC.entity.Message;
import JDBC.tools.DB2;

import java.sql.SQLException;

public class MessageDaoImpl extends DB2 implements MessageDao {
    //向Message表中添加数据。
    @Override
    public void add(Message m) {
        String sql = "insert into message values(?,?,?,?,?)";
        //获得连接对象 conn
        getConn();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,m.getEmpId());
            ps.setString(2,m.getEmpAccount());
            ps.setString(3,m.getEmpPassword());
            ps.setString(4,m.getEmpName());
            ps.setInt(5,m.getEmpType());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源。
            close();
            System.out.println("添加成功~");
        }
    }
}

