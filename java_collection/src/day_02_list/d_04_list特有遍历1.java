package day_02_list;

import java.util.ArrayList;
import java.util.List;

public class d_04_list特有遍历1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历
        for (int x = 0;x < list.size();x++){
            System.out.println((String) list.get(x));
        }
    }
}
