package JDBC.test;

import JDBC.dao.Impl.MessageDaoImpl;
import JDBC.dao.MessageDao;
import JDBC.entity.Message;

public class MessageDaoTest {
    public static void main(String[] args) {
        MessageDao md = new MessageDaoImpl();
        //创建Message实体类。
        Message m = new Message();
        m.setEmpId(8);
        m.setEmpAccount("007");
        m.setEmpPassword("211");
        m.setEmpName("测试");
        m.setEmpType(9);
        //执行MessageDaoImpl里面的add方法。
        md.add(m);
    }
}

