package JDBC.dao;

import JDBC.entity.Message;

public interface MessageDao {
    //向Message表中添加数据。
    void add(Message m);
}

