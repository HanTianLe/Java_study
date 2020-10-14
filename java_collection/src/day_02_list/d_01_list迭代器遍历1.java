package day_02_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d_01_list迭代器遍历1 {
    public static void main(String[] args) {
        // 创建list集合对象
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        // 遍历
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println((String) it.next());
        }
    }
}
