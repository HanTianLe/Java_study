package day_03_arraylist_vector_linkedlist;

import day_03_arraylist_vector_linkedlist.entity.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  问题：去除集合中自定义对象的重复值（对象的成员变量值都相同）
 *
 *  分析：如果直接像去除重复字符串那样用contains()方法是不行的，
 *      因为contains()方法的底层依赖的是equals()方法。而我们的学生类中没有equals()方法。
 *      这个时候，默认使用的是它父亲Object的equals()方法Object()的equals()默认比较的是地址值，
 *      所以，它们进去了。因为new的东西，地址值都不同。
 *      按照我们自己的需求，比较成员变量的值，重写Student类中的equals()即可。
 *
 */
public class d_02_ArrayList集合中去除重复自定义对象元素 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        Student s1 = new Student("张三",11);
        Student s2 = new Student("李四",44);
        Student s3 = new Student("张三",11);
        Student s4 = new Student("赵六",88);
        Student s5 = new Student("张三",88);
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);

        //创建新集合
        ArrayList newArray = new ArrayList();

        //遍历旧集合，获取得到每一个元素
        Iterator it = array.iterator();
        while (it.hasNext()){
            Student s = (Student) it.next();
            //拿这个元素到新集合中去找，没有就添加
            if (!newArray.contains(s)){
                newArray.add(s);
            }
        }
        //遍历新集合
        for (int i = 0; i < newArray.size(); i++) {
            Student student = (Student) newArray.get(i);
            System.out.println(student.getName()+"---"+student.getAge());
        }

    }
}


