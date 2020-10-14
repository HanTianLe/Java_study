package day_04_泛型;

import day_01_collection.pojo.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class d_02_ArrayList存储自定义对象并遍历_泛型版 {
    public static void main(String[] args) {
        //创建集合对象
        //JDK 7以上新特性：泛型推断。
        //后面的<>里面可以不用写Student。（最好写）
        ArrayList<Student> array = new ArrayList<Student>();
        //创建元素对象
        Student s1 = new Student("韩信",21);
        Student s2 = new Student("曹操",22);
        Student s3 = new Student("关羽",23);
        //添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);
        //遍历
        Iterator<Student> it = array.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------------------");
        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            System.out.println(s.getName()+"--"+s.getAge());
        }
    }
}
