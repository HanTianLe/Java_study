package day_01_collection;

import day_01_collection.pojo.Student;

import java.util.ArrayList;
import java.util.Collection;

public class d_04_collection遍历举例1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Student s1 = new Student("张三",11);
        Student s2 = new Student("李四",22);
        Student s3 = new Student("王五",33);
        c.add(s1);
        c.add(s2);
        c.add(s3);

        //转数组
        Object[] obj = c.toArray();

        //遍历
        for (int x = 0;x < obj.length; x++){
            Student s = (Student) obj[x];
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
