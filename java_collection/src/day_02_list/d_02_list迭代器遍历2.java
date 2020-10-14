package day_02_list;

import day_01_collection.pojo.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 遍历自定义对象
 */
public class d_02_list迭代器遍历2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Student s1 = new Student("张3",11);
        Student s2 = new Student("李4",22);
        Student s3 = new Student("王5",33);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //遍历
        Iterator it = list.iterator();
        while (it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
