package JDBC;

import JDBC.tools.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbc_mysql_4_登录 extends DB{
    /** 登录 */
    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账号：");
        String id = sc.nextLine();
        System.out.print("请输入密码：");
        String pwd = sc.nextLine();
        String sql = "select empName from message where empId = ? and empPassword = ?"; //利用占位符。
        //获得连接对象 conn
        getConn();

        try {
            /**
             *  PreparedStatement接口：
             *                  继承自Statement接口，
             *                  比Statement对象使用起来更灵活，更有效率。
             *                  提高了安全性。
             */
            PreparedStatement ps = conn.prepareStatement(sql);
            //给占位符 ？赋值
            ps.setString(1,id);
            ps.setString(2,pwd);
            //执行命令。
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                System.out.println("尊敬的【"+rs.getString("empName")
                        +"】,欢迎您！您已登录成功~");
            }else {
                System.out.println("滚！！！");
            }
            //关闭资源(对象使用的顺序，倒序)。
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new jdbc_mysql_4_登录().login();
    }
}

