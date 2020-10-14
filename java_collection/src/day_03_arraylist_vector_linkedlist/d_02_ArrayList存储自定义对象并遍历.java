package day_03_arraylist_vector_linkedlist;

import day_01_collection.pojo.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class d_02_ArrayList存储自定义对象并遍历 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        Student s1 = new Student("张三",11);
        Student s2 = new Student("李四",22);
        Student s3 = new Student("赵六",66);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        Iterator it = array.iterator();
        while (it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }
        System.out.println("-------------------------------");
        for (int x = 0;x < array.size();x++){
            Student s = (Student) array.get(x);
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
