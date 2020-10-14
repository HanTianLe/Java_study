package day_03_arraylist_vector_linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  ArrayList去除集合中字符串的重复值（字符串的内容相同）
 *  要求：不能创建新的集合，就在以前集合上做。
 *
 */
public class d_02_ArrayList集合中去除重复字符串2 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("hello");
        array.add("world");
        array.add("java");

        //由选择排序思想引入，我们就可以通过这个思想做这个题目
        //拿0索引的依次和后面的比较，有就把后面的干掉
        //同理，拿1索引...
        for (int x = 0;x<array.size()-1;x++){
            for (int y = x+1; y < array.size(); y++) {
                if (array.get(x).equals(array.get(y))){
                    array.remove(y);
                    y--;
                }
            }
        }
        //遍历集合
        Iterator it = array.iterator();
        while (it.hasNext()){
            System.out.println((String) it.next());
        }
    }
}
