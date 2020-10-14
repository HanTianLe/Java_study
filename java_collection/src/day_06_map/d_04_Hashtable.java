package day_06_map;

import java.util.HashMap;
import java.util.Hashtable;
/**
 *  Hashtable 与 HashMap 的区别 ？
 *
 *  Hashtable：线程安全，效率低。不允许 null键和 null值。
 *
 *  HashMap：线程不安全，效率高。允许 null键和 null值。
 *
 *      List、Set 不是继承自Map接口，他们继承自Collection接口。
 *      Map 本身就是一个顶层接口。
 *
 */

public class d_04_Hashtable {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<String,String> hm = new HashMap<String, String>();
        hm.put("1","hello");
        hm.put("world",null);
        hm.put(null,"Java");
        System.out.println(hm); //{null=Java, 1=hello, world=null}
        //创建Hashtable集合
        Hashtable<String,String> ht = new Hashtable<String, String>();
        ht.put("1","hello");
        ht.put("world",null);// 报错  NullPointerException
        ht.put(null,"Java"); // 报错  NullPointerException
        System.out.println(ht);

    }
}
