package day_01_collection;

import java.util.ArrayList;
import java.util.Collection;

public class d_03_collection遍历1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");

        // Object[] toArray()：把集合转换为数组
        Object[] objects = c.toArray();
        // 遍历
        for (int x = 0;x<objects.length;x++){
            // 获取元素的同时，知道元素的长度
            String s = (String) objects[x];
            System.out.println(s+"---"+s.length());
        }
    }
}
