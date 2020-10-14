package day_01_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class d_03_collection遍历2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");

        // Iterator iterator() :迭代器，集合的专用遍历方式。
        Iterator it = c.iterator();

        // 遍历
        // Object next() :获取元素，并移动到子下一个位置。
        // boolean hasNext() :如果仍有元素可以迭代，则返回true。
        while (it.hasNext()){
            System.out.println((String) it.next());
        }
    }
}
