package JDBC.dao;

import JDBC.entity.Student;

import java.util.List;

public interface StudentDao {
    //增
    void add();
    //删
    void delete();
    //改
    void modify();
    //查
    List<Student> findAll();
}

