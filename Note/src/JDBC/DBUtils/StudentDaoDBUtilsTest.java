package JDBC.DBUtils;

import JDBC.dao.Impl.StudentDaoImpl;
import JDBC.dao.StudentDao;
import JDBC.entity.Student;

import java.util.List;

public class StudentDaoDBUtilsTest {
    public static void main(String[] args) {
        StudentDao sd = new StudentDaoImpl();
        //sd.add();
        //sd.modify();
        //sd.delete();
        List<Student> lists = sd.findAll();//接收findAll()传来的list。
        //遍历
        lists.forEach(System.out::println);
    }
}
