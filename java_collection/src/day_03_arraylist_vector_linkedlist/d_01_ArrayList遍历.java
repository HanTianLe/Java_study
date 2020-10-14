package day_03_arraylist_vector_linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

public class d_01_ArrayList遍历 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("hello");
        array.add("world");
        array.add("java");

        // 迭代器遍历
        Iterator iterator = array.iterator();
        while (iterator.hasNext()){
            System.out.println((String) iterator.next());
        }
        System.out.println("-----------------------------");

        // for循环遍历
        for (int x = 0;x < array.size();x++){
            System.out.println((String) array.get(x));
        }
    }
}
