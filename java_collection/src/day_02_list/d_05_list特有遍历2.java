package day_02_list;

import day_01_collection.pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class d_05_list特有遍历2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Student s1 = new Student("张三",11);
        Student s2 = new Student("李四",22);
        Student s3 = new Student("王5",55);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int x = 0;x < list.size();x++){
            Student s = (Student) list.get(x);
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
