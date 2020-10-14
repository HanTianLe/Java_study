package day_05_set;

import day_01_collection.pojo.Student;

import java.util.HashSet;

/**
 *  HashSet：它不保证 set 的迭代顺序；特别是它不保证顺序恒久不变。
 *
 */
public class d_02_HashSet集合 {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs = new HashSet<String>();
        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("Java");
        hs.add("Java");

        for (String s : hs){
            System.out.println(s);
        }
        System.out.println("元素个数："+hs.size());
        System.out.println("----------------------------------");

        HashSet<Student> hashSet = new HashSet<Student>();
        Student s1 = new Student("张三",21);
        Student s2 = new Student("张三",21);
        Student s3 = new Student("张三",22);
        Student s4 = new Student("李四",21);
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        for (Student student : hashSet){
            System.out.println(student);
        }
        System.out.println("元素对象个数："+hashSet.size());
    }
}
