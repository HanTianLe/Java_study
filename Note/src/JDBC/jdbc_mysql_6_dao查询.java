package JDBC;

import JDBC.entity.Message;
import JDBC.tools.DB2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *  非常流行的数据库访问模式-----DAO模式
 *      Data Access Object（数据存取对象）。
 *      位于业务逻辑和持久化数据之间。
 *      实现对持久化数据的访问。
 *
 *     （将数据库中的表，转换成程序中的类，将表中的一行数据，转换成程序中的一个对象。）
 */
public class jdbc_mysql_6_dao查询 extends DB2 {
    //获取全部信息。
    public List<Message> getAllMessage(){
        //
        List<Message> list = new ArrayList();
        //查询语句
        String sql = "select * from message";
        //获得连接对象 conn
        getConn();

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                //创建Message类对象。
                Message m = new Message();
                m.setEmpId(rs.getInt(1));
                m.setEmpAccount(rs.getString(2));
                m.setEmpPassword(rs.getString(3));
                m.setEmpName(rs.getString(4));
                m.setEmpType(rs.getInt(5));

                list.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            close();
        }
        return list;
    }

    //执行。
    public static void main(String[] args) {
        List<Message> list = new jdbc_mysql_6_dao查询().getAllMessage();
        /** 输出数据的组数。*/
        System.out.println(list.size()+"组");
        /** 输出集合中的每一个元素。 */
        list.forEach(System.out::println);
    }
}

