package day_01_collection;

import day_01_collection.pojo.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class d_04_collection遍历举例2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Student s1 = new Student("张三",11);
        Student s2 = new Student("李四",22);
        c.add(s1);
        c.add(s2);

        //运用迭代器
//        Iterator it = c.iterator();
//        while (it.hasNext()){
//            //System.out.println(it.next());
//            Student s = (Student) it.next();
//            System.out.println(s.getName()+"--"+s.getAge());
//        }

        //for循环改写（这样写for遍历完，iterator就是垃圾了，效率随之提高）
        for (Iterator it = c.iterator();it.hasNext();){
            Student s = (Student) it.next();
            System.out.println(s.getName()+"--"+s.getAge());
        }
    }
}
