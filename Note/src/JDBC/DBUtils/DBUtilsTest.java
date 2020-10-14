package JDBC.DBUtils;

import JDBC.entity.Student;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DBUtilsTest {
    private static ComboPooledDataSource dataSource;
    //使用c3p0连接池
    static {
        dataSource = new ComboPooledDataSource("test_c3p0_2");
    }

    public static void main(String[] args) {
        // 原始方法
        Student student = findById();
        System.out.println(student);
        // DBUtils方法(带参)
        Student student1 = findByDbUtils(30);
        // 不带参的情况
//        Student student1 = findByDbUtils();
        System.out.println(student1);
    }

    /**
     *  原始方法
     *  @return
     */
    public static Student findById(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Student student = null;
        try {
            connection = dataSource.getConnection();
            String sql = "select * from student where id = 30";
            preparedStatement =connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Double score = resultSet.getDouble(3);
                Date birthday = resultSet.getDate(4);
                student = new Student(id,name,score,birthday);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return student;
    }


    /**
     *  DBUtils方法
     *  @return
     */
    public static Student findByDbUtils(Integer id){
        // 不带参数的情况。
        // public static Student findByDbUtils(){
        Connection connection = null;
        Student student = null;
        try {
            connection = dataSource.getConnection();
            String sql = "select * from student where id = ?";//(带参)
            // 不带参的情况。
            // String sql = "select * from student where id = 30";
            QueryRunner queryRunner = new QueryRunner();
            // BeanHandler 将结果集映射成 Java 对象 Student。(带参)
            student = queryRunner.query(connection,sql,new BeanHandler<>(Student.class),id);
            // 不带参的情况。
//            student = queryRunner.query(connection,sql,new BeanHandler<>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return student;
    }

}
