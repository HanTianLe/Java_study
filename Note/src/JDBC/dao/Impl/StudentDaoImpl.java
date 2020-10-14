package JDBC.dao.Impl;

import JDBC.dao.StudentDao;
import JDBC.entity.Student;
import JDBC.tools.DB;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl extends DB implements StudentDao {
    @Override
    public void add() {
        //获取连接对象。conn
        getConn();
        String sql = "insert into Student values(?,?,?,?)";
        QueryRunner q = new QueryRunner();
        try {
            q.update(conn,sql,35,"王八",80,20200423);
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                //调用DbUtils类中的关闭资源的close()方法。
                //不需要再调用如DB2工具类中的close()方法了。
                DbUtils.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } finally {
            System.out.println("添加成功~");
        }
    }

    @Override
    public void delete() {
        //获取连接对象。conn
        getConn();
        String sql = "delete from Student where id = ?";
        QueryRunner q = new QueryRunner();
        try {
            q.update(conn,sql,35);
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                //调用DbUtils类中的关闭资源的close()方法。
                //不需要再调用如DB2工具类中的close()方法了。
                DbUtils.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }finally {
            System.out.println("删除成功~");
        }
    }

    @Override
    public void modify() {
        //获取连接对象。conn
        getConn();
        String sql = "update Student set name = ? where id = ?";
        QueryRunner q = new QueryRunner();
        try {
            q.update(conn,sql,"王8",35);
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                //调用DbUtils类中的关闭资源的close()方法。
                //不需要再调用如DB2工具类中的close()方法了。
                DbUtils.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }finally {
            System.out.println("修改成功~");
        }
    }

    @Override
    public List<Student> findAll() {
        List<Student> list = null;
        String sql = "select * from Student";
        getConn();
        QueryRunner q = new QueryRunner();
        try {
            list = q.query(conn,sql,new BeanListHandler<Student>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

