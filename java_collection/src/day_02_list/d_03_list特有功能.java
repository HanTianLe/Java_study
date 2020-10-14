package day_02_list;

import java.util.ArrayList;
import java.util.List;

public class d_03_list特有功能 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        // void add(int index,Object element):在指定位置添加元素。   （索引不能越界）
        list.add(1,"android");
        System.out.println(list);// [hello, android, world, java]
        list.add(4,"C++");
        System.out.println(list);// [hello, android, world, java, C++]

        // Object get(int index):获取指定位置的元素。    （索引不能越界）
        System.out.println(list.get(0));// hello
        System.out.println(list.get(4));// C++

        // Object remove(int index):根据索引删除元素，返回被删除的元素。 （索引不能越界）
        System.out.println(list.remove(4));// C++
        System.out.println(list);// [hello, android, world, java]

        // Object set(int index,Object element):根据索引修改元素，返回被修改的元素。  （索引不能越界）
        System.out.println(list.set(3, "java~"));// java
        System.out.println(list);// [hello, android, world, java~]
    }
}
