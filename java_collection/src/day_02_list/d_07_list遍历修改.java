package day_02_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class d_07_list遍历修改 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        // 迭代器迭代元素，迭代器修改元素。
        ListIterator lit = list.listIterator();
        while (lit.hasNext()){
            String s = (String) lit.next();
            if ("world".equals(s)){
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
