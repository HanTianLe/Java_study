package day_01_collection;

import java.util.ArrayList;
import java.util.Collection;

public class d_01_collection方法 {
    public static void main(String[] args) {

        // boolean add(Object obj) :添加一个元素。
        Collection c = new ArrayList();
        System.out.println("add："+c.add("hello world"));//返回的是一个Boolean值：true
        c.add("Tom");
        c.add("Tom");
        c.add("Jerry");
        System.out.println(c);// [hello world, Tom, Tom, Jerry]

        // void clear() :移除所有元素。
        c.clear();
        System.out.println(c);// []

        c.add("Tom");
        c.add("Jerry");
        c.add("Jack");
        c.add("Tom");
        c.add("Jack");

        // boolean remove(Object o) :移除一个元素。
        System.out.println("remove："+c.remove("jerry"));// false
        System.out.println("remove："+c.remove("Jerry"));// true
        System.out.println(c);// [Tom, Jack, Tom, Jack]
        c.remove("Tom");
        System.out.println(c);// [Jack, Tom, Jack]

        // boolean contains(Object o) :判断集合中是否包含指定的元素。
        System.out.println("contains："+c.contains("Jerry"));// false
        System.out.println("contains："+c.contains("Jack"));// true

        // boolean isEmpty() :判断集合是否为空。
        System.out.println("isEmpty："+c.isEmpty());// false（有元素，不为空）

        // int size() :元素的个数。
        System.out.println("size："+c.size());// 3

    }
}
