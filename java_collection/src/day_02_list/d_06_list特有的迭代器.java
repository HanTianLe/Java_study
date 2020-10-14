package day_02_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class d_06_list特有的迭代器 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        // ListIterator listIterator() :List集合特有的迭代器。
        ListIterator lit = list.listIterator();
        while (lit.hasNext()){
            System.out.println((String) lit.next());
        }
        System.out.println("------------------------");


        // Object previous() :获取上一个元素  --->返回列表中的前一个元素。
//        System.out.println(lit.previous());// java
//        System.out.println(lit.previous());// world
//        System.out.println(lit.previous());// hello
        //System.out.println(lit.previous());//NoSuchElementException异常
        System.out.println("------------------------");


        // boolean hasPrevious() :判断是否有元素。 --->如果以逆向遍历列表，列表迭代器有多个元素，则返回true。
        // 注意：ListIterator可以实现逆向遍历，但必须先正向遍历后，才能逆向遍历。（一般不使用，无意义。）
        while (lit.hasPrevious()){
            System.out.println((String) lit.previous());
        }
    }
}
